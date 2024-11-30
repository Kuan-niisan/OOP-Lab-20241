package hust.soict.dsai.aims.media;

import java.util.*;

public class Book {

	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	
	
	
	public int getId() {
		return id;
	}



	public String getTitle() {
		return title;
	}



	public String getCategory() {
		return category;
	}



	public float getCost() {
		return cost;
	}

	public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else {
            System.out.println("This author has already been in the list!");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("No author has been found to remove!");
        }
    }


	public Book() {
		// TODO Auto-generated constructor stub
	}

}
