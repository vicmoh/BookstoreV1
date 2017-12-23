//import  package
package lab3;
import java.util.*;

public class Bookstore {
    public static void main(String[] args) {
        //declare object
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<Book>();
        Book newBook = new Book("Title", "Author", 0, "ISBN", 0);
        //String retrieved = bookList.get(0); // 0th element
        //listSize = bookList.size(); // # of elementstatic String bookName;
        
        //decalre var
        int menu = 0;
        String title, author, isbn;
        int year = 0;
        double price;
        
        //display the options
        System.out.println("1. Add a unique book to the inventory");
        System.out.println("2. Print out information on each book");
        System.out.println("3. Print out all unique authors");
        System.out.println("4. Print out the average book price & total books");
        System.out.println("5. Quit");
        
        while(menu != 5){
            //ask the user
            System.out.println("\nWhich option do you want?");
            menu = scan.nextInt();
            scan.nextLine();//so it does not skipped
            System.out.println(" ");
            //choose menu
            if(menu == 1){
                //ask the user of the book
                System.out.println("Enter the title of book:");
                title = scan.nextLine();
                System.out.println("Enter the author of the book:");
                author = scan.nextLine();
                System.out.println("Enter the year of publication");
                year = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter the ISBN");
                isbn = scan.nextLine();
                System.out.println("Enter the price of the book");
                price = scan.nextDouble();
                scan.nextLine();
                bookList.add(new Book(title, author, year, isbn, price));
                System.out.println("\nBooked added...");
            }else if(menu == 2){
                //print the books in the list
                int bookNumber = 0;
                System.out.println("***************************************");
                for(int x=0; x < newBook.amountOfBook(); x++){
                    bookNumber++;
                    System.out.println("Book Number: " + bookNumber);
                    newBook = bookList.get(x);
                    newBook.toString();
                    System.out.println("***************************************");
                }//end for loop
            }else if(menu == 3){
                boolean sameAuthor;
                System.out.println("List of author available...");
                //check if any author is the same if not print
                for(int x=0; x < bookList.size(); x++){
                    sameAuthor = false;
                    for(int y=1; y+x+1 < bookList.size(); y++){
                        //System.out.println(bookList.get(x).getAuthor() + " and " + bookList.get(y).getAuthor());
                        if(bookList.get(x).getAuthor().equals(bookList.get(y).getAuthor())){
                            sameAuthor = true;
                            //System.out.println(sameAuthor);
                        }//end if
                    }//end loop
                    if(sameAuthor == false){
                        System.out.println(bookList.get(x).getAuthor());
                    }//end if
                }//end for loop
            }else if(menu == 4){
                double averagePrice = 0;
                for(int x=0; x < newBook.amountOfBook(); x++){
                    newBook = bookList.get(x);
                    averagePrice = averagePrice + newBook.getPrice();
                }//end for loop
                averagePrice = averagePrice/newBook.amountOfBook();
                System.out.println("Calculating...");
                System.out.println("The average price of all book is $" + averagePrice);
                System.out.println("And the total number of book is " + newBook.amountOfBook());
            }else if(menu == 5){
                System.out.println("Program Exited...");
            }//end if
        }//end while1
    }//end main
}//end class
