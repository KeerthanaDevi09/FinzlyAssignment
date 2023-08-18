package OopConcepts;

public class Book extends LibraryItem {
	private String author;
	
	public Book(String author,String title,int itemId) {
		super(title,itemId);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Author name of the book is: "+author);
	}
}
