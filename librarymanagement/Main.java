
package librarymanagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    Scanner sc = new Scanner(System.in);
    List<Book> books = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Main m1 = new Main();
        
        
        boolean exit = true;
        do{
            System.out.println("1.Add Book");
            System.out.println("2.View All Books");
            System.out.println("3.Search Book by ID");
            System.out.println("4.Issue Book");
            System.out.println("5.Return Book");
            System.out.println("6.Delete Book");
            System.out.println("7.Exit");
            System.out.print("Option: ");
            int option = sc.nextInt();
            
            switch(option){
                case 1:
                {
                    m1.addBook();
                    break;
                }
                case 2:
                {
                    m1.viewBooks();
                    break;
                }
                case 3:
                {
                    m1.searchBook();
                    break;
                }
                case 4:
                {
                    m1.issueBook();
                    break;
                }
                case 5:
                {
                    m1.returnBook();
                    break;
                }
                case 6:
                {
                    m1.deleteBook();
                    break;
                }
                case 7:
                {
                    System.out.println("Exiting...");
                }
                default:
                {
                    exit=false;
                }
            }
        }while(exit);
        
    }
    
    void addBook()
    {
        System.out.print("Enter Id: ");
        int id = sc.nextInt();
        
        for(Book b:books)
        {
            if(b.bookId==id)
            {
                System.out.println("Book already Exist.");
                return;
            }
        }
        
        sc.nextLine();
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        
        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();
        
//        System.out.print("Status: ");
//        String status = sc.nextLine();
        
        books.add(new Book(id,title,authorName));
        
        System.out.println("Book Added Successfully");
    }
    
    
    void viewBooks()
    {
        if(books.isEmpty())
        {
            System.out.println("No books available.");
        }
        for(Book b:books)
        {
            b.display();
        }
    }
    
    void searchBook()
    {
        System.out.print("Enter Book Id: ");
        int id = sc.nextInt();
        
        for(Book b:books)
        {
            if(b.bookId==id)
            {
                b.display();
                return;
            }
        }
        System.out.println("Book not found.");
    }
    
    void issueBook()
    {
        System.out.print("Enter Book Id: ");
        int id = sc.nextInt();
        
        for(Book b:books)
        {
            if(b.bookId==id)
            {
                if(b.status.equals("Available"))
                {
                    b.status = "Issued";
                    System.out.println("Book issued Successfully!");
                }
                else{
                    System.out.println("Book already issued!");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
    
    void returnBook()
    {
        System.out.print("Enter Book Id: ");
        int id = sc.nextInt();
        
        for(Book b:books)
        {
            if(b.bookId==id)
            {
                if(b.status.equals("Issued"))
                {
                    b.status="available";
                    System.out.println("Book returned Successfully!");
                }
                else
                {
                    System.out.println("Book is already available!");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
    
    void deleteBook()
    {
        System.out.print("Enter Id: ");
        int id = sc.nextInt();
        
        Iterator<Book> it = books.iterator();
        
        while(it.hasNext())
        {
            Book b = it.next();
            if(b.bookId==id)
            {
                it.remove();
                System.out.println("Book deleted Successfully!");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
