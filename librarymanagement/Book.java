
package librarymanagement;


public class Book {
    int bookId;
    String title;
    String author;
    String status;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.status = "Available";
    }
    
    void display()
    {
        System.out.println("Bood Id: "+bookId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
       System.out.println("Status: "+status);
    }
}
