package hust.soict.dsai.aims.cart;

import java.util.*;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full!");
        } else if (itemsOrdered.contains(media)) {
            System.out.println(media.getTitle() + " is already in the cart!");
        } else {
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " has been added!");

        }
    }
    public void removeMedia(Media media) {
        if (itemsOrdered.size() == 0) {
            System.out.println("Nothing to remove!");
        } else {
            if (itemsOrdered.remove(media)) {
                System.out.println(media.getTitle() + " has been removed from the cart.");
            } else {
                System.out.println("Media not found in cart!");
            }
        }
    }
    
    public Media searchToRemove(String title) {
		for (Media media : itemsOrdered) {
			if (media.getTitle().equals(title)) {
				return media;
			}
		}
		return null;
	}
    public void searchByID(int id) {
    	boolean found = false;
    	for (Media media : itemsOrdered) {
    		if (media.getId() == id) {
    			System.out.println("Found" + media);
    			found = true;
    		}
    	}
    	if (!found) {	
    		System.out.println("No DVDs were found!");
    	}
    }
    
    public void searchByTitle(String title) {
    	boolean found = false;
    	for (Media media : itemsOrdered){
    		if (media.isMatch(title)) {
    			System.out.println("Found" + media);
    			found = true;
    		}
    	}
    	if (!found) {
    		System.out.println("No DVDs were found!");
    	}
    }
    
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
    
    public void print() {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	for (Media media : itemsOrdered) {
    		System.out.println(media);
    	}
    	System.out.println("Total cost:" + totalCost());
    	System.out.println("***************************************************");
    }
    
    public void empty() {
        if (itemsOrdered.size() == 0) {
            System.out.println("Nothing to remove!");
        } else {
            itemsOrdered.clear();
            System.out.println("Order created.");
            System.out.println("Now your current cart will be empty!");
            System.out.println();
        }
    }


    public void sortMediaByTitle() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
    public void sortMediaByCost() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
}

