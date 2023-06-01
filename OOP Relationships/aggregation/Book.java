package aggregation;

public class Book {
	
	private String title;
    private Author author;
    
    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }
    
    public void setBook(String title,Author author) {
    	this.title=title;
    	this.author=author;
    }
    public void displayBook() {
    	System.out.print("title - "+this.title);
    	System.out.println(" author- "+this.author.getName());
    }

}
