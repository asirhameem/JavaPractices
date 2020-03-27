public class Book{
	
	String bookName;
	String bookAuthor;
	String bookId;
	String bookType;
	int bookCopy;
	public static int numberOfBook;
	
	public Book(){
		bookName= " ";
		bookAuthor=" ";
		bookId=" ";
		bookType = " ";
		bookCopy= 0;
		numberOfBook = 0;
		
	}
	
	public Book(String bookName,String bookAuthor, String bookId,String bookType)
	{
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
		this.bookCopy =bookCopy;
		++numberOfBook;
	}
	
	public String getbookName()
	{
		return bookName;
	}
	
	
	public int getnumberOfBook()
	{
		return numberOfBook;
	}
		
	public void showInfo()
	{
		System.out.println("Book Name:"+bookName);
		System.out.println("Author:"+bookAuthor);
		System.out.println("Id:"+bookId);
		System.out.println("Type:"+bookType);
		System.out.println("Number of Same Book:");
		System.out.println("Total Number of Books:"+numberOfBook);
	}
	void addBookCopy(int x)
	{
		bookCopy +=x;
	}
}
	