import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {

    private static int nextBookId=1;
    private static ArrayList<Book> books=new ArrayList<>();

    private static Scanner input=new Scanner(System.in);

    private static void addBook(){
        System.out.println("+----------------------------+");
        System.out.println("|          ADD BOOK          |");
        System.out.println("+----------------------------+");

        String id=String.format("B%04d",nextBookId);

        System.out.println("\n\nBook ID: "+id);

        System.out.print("Enter Book Title: ");
        String title=input.nextLine().trim();

        System.out.print("Enter Author Name: ");
        String author=input.nextLine().trim();

        if(title.isEmpty() || author.isEmpty()){
            System.out.println("Invalid book details!");
            return;
        }

        Book newBook=new Book(id,title,author);

        books.add(newBook);

        nextBookId++;

        System.out.println("\tBook added successfully!");

        System.out.println("\nDo you want to add a new Book? (Y/N): ");
        String newOne= input.nextLine();

        if (newOne.equalsIgnoreCase("Y")){
            addBook();
        }
        if (newOne.equalsIgnoreCase("N")){
            return;
        }
    }

    private static void viewAllBooks(){
        System.out.println("+----------------------------------+");
        System.out.println("|            ALL BOOKS             |");
        System.out.println("+----------------------------------+");

        if (books.isEmpty()){
            System.out.println("No books found in the library.");
            return;
        }

        boolean found =false;

        for (Book book:books){
            if(book.isAvailable()){
                book.displayDetails();

                System.out.println("------------------------------------");
                found=true;
            }
        }

        if (!found){
            System.out.println("No available books at the moment.");
        }
    }

    private static void removeBook(){
        System.out.println("+---------------------------------------------+");
        System.out.println("|               REMOVE BOOK                   |");
        System.out.println("+---------------------------------------------+");

        if(books.isEmpty()){
            System.out.println("No books available to remove.");
            return;
        }

        System.out.print("\nEnter book ID to remove: ");
        String searchId=input.nextLine().trim();

        for(Book book:books){
            if(book.getBookID().equalsIgnoreCase(searchId)){
                if(!book.isAvailable()){
                    System.out.println("Cannot remove this book. It is currently issued.");
                    return;
                }
                books.remove(book);

                System.out.println("\n\nBook removed successfully!");

                return;
            }
        }
        System.out.println("Book with ID "+ searchId + " not found.");
    }
    private static void homeMenu(){
        int choice;

        do{
            System.out.println("+-----------------------------------------------------------------+");
            System.out.println("|                Library Management System                        |");
            System.out.println("+-----------------------------------------------------------------+");

            System.out.println("\n\t\t[1]. Add Book");
            System.out.println("\t\t[2]. Remove Book");
            System.out.println("\t\t[3]. View Available Books");
            System.out.println("\t\t[4]. Search Book");
            System.out.println("\t\t[5]. Issue Book");
            System.out.println("\t\t[6]. Return Book");
            System.out.println("\t\t[7]. Exit");

            System.out.print("\nEnter your choice: ");

            try{
                choice=Integer.parseInt(input.nextLine().trim());
            }catch (NumberFormatException e){
                System.out.println("Invalid input! Please enter a number...");
                choice=0;
            }

            switch (choice){
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;

                case 3:
                    viewAllBooks();
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    System.out.println("Thank you for using the Library System...");
                    break;

                default:
                    System.out.println("Invalid choice! Select between 1 and 7.");
            }
        }while (choice != 7);
    }


    public static void main(String[] args) {
        homeMenu();
    }
}
