package hust.soict.dsai.aims.media;

public abstract class Media {

	private int id;
	private String title;
	private String category;
	private float cost;
	
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

	public Media() {
		// TODO Auto-generated constructor stub
	}

}