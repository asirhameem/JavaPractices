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
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Book b1 = new Book ("111","Ghore Baire","Tagore",1961);
        Book b2 = new Book ("222","Kabuliwala","Tagore",1912);
        Book b3 = new Book ("333","Sheser Kobita","Tagore",1910);
        Book b4 = new Book ("444","Gora","Tagore",1929);
        Book b5 = new Book ("555","Chokher Bali","Tagore",1903);
        Book b6 = new Book ("666","Bahu Bali","Tagore",1903);
        
        //b1.showInfo();
        Book[] books = {b1,b2,b3,b4,b5};
        
        
        Library l1 = new Library("Kuratoli Libray","Aiub",books);
        //l1.showInfo();
       l1.addBook(b6);
       
       //l1.removeBook(b6);
           
       l1.showInfo();
       
       
        
        
        
        
        
    }
    
}
