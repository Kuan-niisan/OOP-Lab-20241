package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media implements Comparable<Media> {
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	private static int nbDigitalVideoDiscs = 0;
	private int id;
	private String title;
	private String category;
	private float cost;
	
	
	public Media(String title) {
        this.title = title;
        this.id = ++nbDigitalVideoDiscs;

    }
    public Media(String title, String category) {
        this.title = title;
        this.category = category;
        this.id = ++nbDigitalVideoDiscs;

    }
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }
    
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

	public boolean isMatch(String title) {
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }
	@Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        return ((Media)obj).getTitle() == this.getTitle();
    }
	 @Override
	public String toString() {
	    return "Media: " + this.getTitle() +
	    	   " - Category: " + this.getCategory() +
	           " - Cost: " + this.getCost() + "$";
	    }
	 @Override
	    public int compareTo(Media other) {
	        int titleComparison = this.getTitle().compareTo(other.getTitle());
	        if (titleComparison != 0) {
	            return titleComparison;
	        } else {
	            return Double.compare(this.getCost(), other.getCost());
	        }
	    }
}
