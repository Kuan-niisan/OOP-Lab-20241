package hust.soict.dsai.aims.media;

public abstract class Media {

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

}
