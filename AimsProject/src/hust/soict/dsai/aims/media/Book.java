package hust.soict.dsai.aims.media;

import java.util.*;

public class Book extends Media {

	private List<String> authors = new ArrayList<String>();
	
	
	
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
