package aggregation;

public class Author {
	
	private String name;
    
    public Author(String name) {
        this.name = name;
    }
    
    public void setName(String name) { 
    	this.name=name;
    }
    public String getName() { 
    	return this.name;
    }
    
    public void displayAuthor() {
    	System.out.println("Author name- "+this.name);
    }

}
