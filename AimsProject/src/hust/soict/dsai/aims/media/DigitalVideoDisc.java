
package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.id = ++nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String category, String title, float cost) {
		super();
		this.category = category;
		this.title = title;
		this.cost = cost;
		this.id = ++nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String director, String category, String title, float cost) {
		super();
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
		this.id = ++nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = ++nbDigitalVideoDiscs;
	}

	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	@Override
    public String toString() {
        return "DVD: " + this.title +
                " - Category: " + this.category +
                " - Director: " + this.title +
                " - DVD length: " + this.length +
                " - Cost: " + this.cost + "$";
    }
	
	public boolean isMatch(String title) {
		return this.title.toLowerCase().contains(title.toLowerCase());
	}
}