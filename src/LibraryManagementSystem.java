import java.util.Scanner;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryCatalog<LibraryItem<String>> catalog = new LibraryCatalog<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("\nLibrary Catalog Menu:");
                System.out.println("1. Add Book");
                System.out.println("2. Add DVD");
                System.out.println("3. Add Magazine");
                System.out.println("4. Remove Item");
                System.out.println("5. Search by Title");
                System.out.println("6. Search by Author");
                System.out.println("7. Display Catalog");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Enter title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter item ID: ");
                        String bookID = scanner.nextLine();
                        System.out.print("Enter genre: ");
                        String genre = scanner.nextLine();
                        catalog.addItem(new Book(title, author, bookID, genre));
                        break;
                    case 2:
                        System.out.print("Enter title: ");
                        title = scanner.nextLine();
                        System.out.print("Enter author: ");
                        author = scanner.nextLine();
                        System.out.print("Enter item ID: ");
                        String dvdID = scanner.nextLine();
                        System.out.print("Enter duration (in minutes): ");
                        int duration = Integer.parseInt(scanner.nextLine());
                        catalog.addItem(new DVD(title, author, dvdID, duration));
                        break;
                    case 3:
                        System.out.print("Enter title: ");
                        title = scanner.nextLine();
                        System.out.print("Enter author: ");
                        author = scanner.nextLine();
                        System.out.print("Enter item ID: ");
                        String magID = scanner.nextLine();
                        System.out.print("Enter issue: ");
                        String issue = scanner.nextLine();
                        catalog.addItem(new Magazine(title, author, magID, issue));
                        break;
                    case 4:
                        System.out.print("Enter item ID to remove: ");
                        String removeID = scanner.nextLine();
                        catalog.removeItem(removeID);
                        break;
                    case 5:
                        System.out.print("Enter title to search: ");
                        String searchTitle = scanner.nextLine();
                        catalog.searchByTitle(searchTitle);
                        break;
                    case 6:
                        System.out.print("Enter author to search: ");
                        String searchAuthor = scanner.nextLine();
                        catalog.searchByAuthor(searchAuthor);
                        break;
                    case 7:
                        catalog.displayCatalog();
                        break;
                    case 8:
                        System.out.println("Exiting the program. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please try again.");
            }
        }
    }
}
