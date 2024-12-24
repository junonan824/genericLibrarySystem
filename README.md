Complete Submission
Folder Directory
GenericLibraryCatalog/
│
├── src/
│   ├── Book.java
│   ├── DVD.java
│   ├── Magazine.java
│   ├── LibraryItem.java
│   ├── LibraryCatalog.java
│   ├── LibraryManagementSystem.java
│
├── test/
│   ├── LibraryCatalogTest.java
│
├── output/
│   ├── sample_output.png
│
└── README.md
How to Execute This Program
1. Setting up the Environment
	•	Ensure you have Java JDK 8 or above installed on your system.
	•	Add the src/ folder to your project directory or compile it using the command line.
2. Compilation
To compile all the Java files, navigate to the src/ directory and run:
javac *.java
3. Running the Program
Run the main program LibraryManagementSystem.java using:
java LibraryManagementSystem
Expected Results
Program Menu
After running the program, you will see the following menu options:
Library Catalog Menu:
1. Add Book
2. Add DVD
3. Add Magazine
4. Remove Item
5. Search by Title
6. Search by Author
7. Display Catalog
8. Exit
Enter your choice:
Example Scenarios and Results
1. Adding Items
	•	If you select option 1 (Add Book), you’ll be prompted to enter details:
Enter title: The Great Gatsby
Enter author: F. Scott Fitzgerald
Enter item ID: BK101
Enter genre: Fiction
Item added successfully.
2. Displaying the Catalog
	•	If you select option 7 (Display Catalog), the program will display all added items:
Library Catalog:
Title: The Great Gatsby, Author: F. Scott Fitzgerald, ItemID: BK101, Genre: Fiction
3. Searching by Title
	•	If you select option 5 (Search by Title) and enter a title:
Enter title to search: The Great Gatsby
Search Results for Title: The Great Gatsby
Title: The Great Gatsby, Author: F. Scott Fitzgerald, ItemID: BK101, Genre: Fiction
4. Removing Items
	•	If you select option 4 (Remove Item) and enter a valid itemID:
Enter item ID to remove: BK101
Item removed successfully.
5. Handling Invalid Inputs
	•	If you select an invalid menu option, the program will handle it gracefully:
Invalid choice. Please try again.
Expected Output Screenshot
A screenshot showing the program running with example input and output should be included in the output/sample_output.png file.
This submission provides the folder structure, execution steps, and expected results to guide users on running and verifying the program. Let me know if you need further adjustments!
