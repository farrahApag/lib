package libmanangement;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class student extends LibraryUser {
	private List<String> borrowingHistory;

    public student(String name) {
        super(name);
        this.borrowingHistory = new ArrayList<>();
    }

    @Override
    public void performAction(List<LibraryItem> items) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.println("");
            System.out.println("Hello, " + getName() + "! What would you like to do?");
            System.out.println("1. Borrow an item");
            System.out.println("2. Show borrowing history");
            System.out.println("3. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.println("");
            System.out.println("----------------------");
            
            switch (choice) {
                case 1:
                    borrowItem(items);
                    break;
                case 2:
                    printItemsBorrowed();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private void borrowItem(List<LibraryItem> items) {
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Which item would you like to borrow?");
        System.out.println("1. Book");
        System.out.println("2. DVD");
        int itemType = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String type = itemType == 1 ? "Book" : "DVD";

        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
        System.out.println("Enter the title of the " + type + " you want to borrow:");
        String title = scanner.nextLine();

        borrowingHistory.add(type + ": " + title);
        System.out.println(type + ": " + title + " borrowed.");
        System.out.println("");
        System.out.println("----------------------");
    }
    

    private void printItemsBorrowed() {
    	System.out.println("");
        System.out.println("Borrowing history for " + getName() + ":");
        for (String item : borrowingHistory) {
            System.out.println(item);
        }
        System.out.println("");
        System.out.println("----------------------");
    }
}