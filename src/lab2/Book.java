//import library
package lab3;
import java.util.*;
import java.text.*;

public class Book {
    //decalre
    private static int numOfBook = -1;
    private String title, author, isbn;
    private int year;
    private double price;
    
    public Book(String title, String author, int year, String isbn, double price){
        //add books
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        numOfBook++;
    }//end func
    
    public int amountOfBook(){
        return numOfBook;
    }//end if
    
    public String getAuthor(){
        return author;
    }//ens func
    
    public double getPrice(){
        return price;
    }//end func
    
    public String getISBN(){
        return isbn;
    }//end func
    
    public boolean equals(Object other){
        //checl if the object is the same
        if (other instanceof Book) {
            Book book = (Book) other;
            if (this.author.equals(book.author)){
                return true;
            }//end if
        }//end if
        return false;
    }//end func
    
    public String toString(){
        //set object of 2 decimal format
       DecimalFormat twoDecimal = new DecimalFormat();
       twoDecimal.setMaximumFractionDigits(2);
       //display book 
       System.out.println("Book: " + title);
       System.out.println("Author: " + author);
       System.out.println("Year of Publication: " + year);
       System.out.println("ISBN: " + isbn);
       System.out.println("Price: $" + twoDecimal.format(price));
       System.out.println("Book: " + title);
       System.out.println("Amount of Book: " + numOfBook);
       return("Amount of Book: " + numOfBook);
    }//end func
}//end class
