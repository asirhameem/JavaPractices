public class Library{
	private String libName,libAddress;
	private Book [] listOfBook;
	int totalBook;
	
	public Library(){
		libName = "";
		libAddress = "";
		totalBook = 0;
	}
	
	public Library(String libName,String libAddress,Book [] listOfBook,int totalBook){
		this.libName = libName;
		this.libAddress = libAddress;
		this.totalBook = totalBook;
		this.listOfBook = listOfBook;
	}
	
	public void showLibInfo(){
		System.out.println("Lirary Name:"+libName);
		System.out.println("Lirary Name:"+libName);
		System.out.println("Lirary Name:"+libName);
		
	}
	
	public void addNewBook(Book book){
		int totalBook = Book.showTotalBook();
		Book [] listOfB = new Book[totalBook + 1];
		listOfB = listOfBook;
		listOfB[totalBook] = book;
		listOfBook = new Book[totalBook+1];
		listOfBook = listOfB;
	}
	
	public void deleteBook(Book book){
		book = null;
	}
	
	public void addNewBookCopy(Book book,int copy){
		book.addBookCopy(copy);
	}
}