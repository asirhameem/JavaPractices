/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7;

/**
 *
 * @author USER
 */
public class Book {
    
    String bookId;
    String bookTitle;
    String authorName;
    int publicationYear;
    int availableQuantity;
    
    
    public Book()
    {
        bookId = "";
        bookTitle ="";
        authorName = "";
        publicationYear = 0 ;
        availableQuantity = 0;
        
    }
    
    public Book(String bookId,String bookTitle, String authorName, int publicationYear)
    {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        ++availableQuantity;
    }
            
    public int getavailableQuantity()
    {
        return availableQuantity;
    }
    public String getbookTitle()
    {
        return bookTitle;
    }
    
    
    public void showInfo()
	{
		System.out.println("Book Name:"+bookTitle);
		System.out.println("ID:"+bookId);
		System.out.println("Author:"+authorName);
		System.out.println("Book publication year:"+publicationYear);
		System.out.println("Total Number of Books:"+availableQuantity);
	}
    
    
}
