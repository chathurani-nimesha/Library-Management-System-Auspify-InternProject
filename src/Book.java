public class Book {
    private String bookID;
    private String title;
    private String author;
    private boolean available;

    public Book(String bookID,String title,String author){
        this.bookID=bookID;
        this.title=title;
        this.author=author;
        this.available=true;
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayDetails(){
        System.out.println("Book ID: "+bookID);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Status: "+ (available ? "Available" : "Issued"));
    }
}