import java.util.ArrayList;
import java.util.List;
public class LibraryCatalog<T extends LibraryItem<String>> {
    private List<T> catalog;
    public LibraryCatalog() {
        catalog = new ArrayList<>();
    }
    public void addItem(T item) {
        catalog.add(item);
        System.out.println("Item added successfully.");
    }
    public void removeItem(String itemID) {
        T itemToRemove = null;
        for (T item : catalog) {
            if (item.getItemID().equals(itemID)) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null) {
            catalog.remove(itemToRemove);
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Error: Item not found.");
        }
    }
    public void searchByTitle(String title) {
        System.out.println("Search Results for Title: " + title);
        for (T item : catalog) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println(item);
            }
        }
    }
    public void searchByAuthor(String author) {
        System.out.println("Search Results for Author: " + author);
        for (T item : catalog) {
            if (item.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(item);
            }
        }
    }
    public void displayCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("The catalog is empty.");
        } else {
            System.out.println("Library Catalog:");
            for (T item : catalog) {
                System.out.println(item);
            }
        }
    }
}
