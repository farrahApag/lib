package libmanangement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library Management System!");
        System.out.println("Are you a Student or a Teacher? Enter 'S' for Student or 'T' for Teacher:");
        String userType = scanner.nextLine();
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");

        System.out.println("Enter your name:");
        String userName = scanner.nextLine();
        System.out.println("");
        System.out.println("----------------------");
        
        LibraryUser user;
        if (userType.equalsIgnoreCase("S")) {
            user = new student(userName);
        } else if (userType.equalsIgnoreCase("T")) {
            user = new Teacher(userName);
        } else {
            System.out.println("Invalid user type");
            return;
        }

        user.performAction(items);
    }
}
