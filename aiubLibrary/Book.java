public class Book{
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;
	private static int bookCounter = 0;
	
	public Book(){
		bookName = "";
		bookAuthor = "";
		bookId = "";
		bookType = "";
		bookCopy = 0;
		bookCounter ++;
	}
	
	public Book(String bookName,String bookAuthor,String bookId,String bookType,int bookCopy){
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
		this.bookCopy = bookCopy;
		bookCounter ++;
	}
	
	public void showInfo(){
		System.out.println("/nBook Name : "+bookName);
		System.out.println("Author's Name : "+bookAuthor);
		System.out.println("Book ID : "+bookId);
		System.out.println("Book Type : "+bookType);
		System.out.println("No of Book : "+bookCopy);
	}
	
	public void addBookCopy(int x){
		bookCopy += x;
	}
	
	public static void showTotalBookInfo(){
		System.out.println("Total Number of book available: "+bookCounter);
	}
	public static int showTotalBook(){
		return bookCounter;
	}
}

