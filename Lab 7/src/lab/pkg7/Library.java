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
public class Library {
       
        String libName;
	String libLocation;
	Book[] books = new Book[10];
        int totalBook;
        
        
        
        public Library()
        {
            String libName = "";
            String libLocation = "";
            
        }
        public Library(String libName, String libLocation,Book []books)
	{
		this.libName = libName  ;
		this.libLocation = libLocation;
		this.books = books;
                ++totalBook;
                	
	}

     
        public void showInfo()
	{
		System.out.println("Library Name:"+libName);
		System.out.println("Library Address:"+libLocation);
		
                for(int i=0;i<=books.length-1;i++)
		{
                    System.out.println("Book List:"+books[i].getbookTitle());
		}		
		
		
	}
        
        public int gettotalBook()
        {
            return totalBook;
        }
        
        /*public int getbookArray()
        {
            return books.length ;
        }*/
        
        public void addBook(Book b)
        {
          for(int i=4; i<books.length;i++)
          {
             books[i] = b ;
          }
          
            
        }
        
        public void removeBook(Book a){
            
            int n = books.length;
            
            books[n-1] = books[n];
        
            
            } 
	
                 



}
         

