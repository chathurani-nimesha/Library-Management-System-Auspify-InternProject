import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {

    private static ArrayList<Book> books=new ArrayList<>();

    private static Scanner input=new Scanner(System.in);

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
                    break;
                case 2:
                    break;

                case 3:
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
