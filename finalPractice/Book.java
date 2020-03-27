public class Book{
	
	String bookName;
	String bookAuthor;
	int bookId;
	int bookCounter;
	
	
	public Book()
	{
		bookName = " ";
		bookAuthor = " ";
		bookId = 0;
	}
	
	public Book(String bookName, String bookAuthor, int bookId)
	{
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		bookCounter++;
		
	}
	
	public void showInfo()
	{
		System.out.println("Book Name:"+bookName);
		System.out.println("Author Name:"+bookAuthor);
		System.out.println("Book Id:"+bookId);
	}
	
	public String getbookName()
	{
		return bookName;
	}
	
	
	
}