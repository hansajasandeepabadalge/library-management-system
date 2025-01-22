import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. List Books");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    library.addBook(new Book(title, author, genre, quantity));
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Title: ");
                    String deleteTitle = scanner.nextLine();
                    library.removeBook(deleteTitle);
                    System.out.println("Book removed successfully!");
                    break;
                case 3:
                    library.listBooks();
                    break;
                case 4:
                    System.out.print("Enter title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    Book borrowBook = library.findBookByTitle(borrowTitle);
                    if (borrowBook == null) {
                        System.out.println("Book not found!");
                    } else {
                        borrowBook.borrowBook();
                        System.out.println("Book borrowed successfully!");
                    }
                    break;
                case 5:
                    System.out.print("Enter title to return: ");
                    String returnTitle = scanner.nextLine();
                    Book returnBook = library.findBookByTitle(returnTitle);
                    if (returnBook == null) {
                        System.out.println("Book not found!");
                    } else {
                        returnBook.returnBook();
                        System.out.println("Book returned successfully!");
                    }
                    break;
                case 6:
                    System.out.println("Thank you for using Library Management System!");
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
