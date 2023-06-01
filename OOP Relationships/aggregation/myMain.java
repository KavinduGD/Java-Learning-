package aggregation;

public class myMain {
	public static void main(String[] args) {
		
		Author author=new Author("Kavindu");
		
		Book book= new Book("Madol Duwa", author);
		
		book.displayBook();
		author.displayAuthor();
		
		
		//author.setName("Nayana");
		
//		author.setName(null);
		
		book.setBook(null, null);
//		book.displayBook();
		System.out.println(book);
		author.displayAuthor();
		
	}

}
