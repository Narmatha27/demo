package addon_dsa;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainprg {
    static ArrayList<Integer> arr = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void display() {
        if (arr.isEmpty()) {
            System.out.println("Array is empty.");
        } else {
            System.out.println("Array elements: " + arr);
        }
    }

    public static void insert() {
        try {
            System.out.print("Enter element to insert: ");
            int element = scanner.nextInt();

            System.out.print("Enter position to insert (0 to " + arr.size() + "): ");
            int position = scanner.nextInt();

            if (position >= 0 && position <= arr.size()) {
                arr.add(position, element);
                System.out.println("Inserted " + element + " at position " + position + ".");
            } else {
                System.out.println("Invalid position.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
            scanner.nextLine(); // Clear invalid input
        }
    }

    public static void delete() {
        if (arr.isEmpty()) {
            System.out.println("Array is empty. Nothing to delete.");
            return;
        }
        try {
            System.out.print("Enter element to delete: ");
            int element = scanner.nextInt();

            if (arr.contains(element)) {
                arr.remove(Integer.valueOf(element)); // remove by value
                System.out.println("Deleted " + element + " from the array.");
            } else {
                System.out.println("Element " + element + " not found in the array.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
            scanner.nextLine();
        }
    }

    public static void search() {
        try {
            System.out.print("Enter element to search: ");
            int element = scanner.nextInt();

            if (arr.contains(element)) {
                System.out.println("Element " + element + " found at position " + arr.indexOf(element) + ".");
            } else {
                System.out.println("Element " + element + " not found in the array.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
            scanner.nextLine();
        }
    }

    public static void menu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        insert();
                        break;
                    case 2:
                        delete();
                        break;
                    case 3:
                        search();
                        break;
                    case 4:
                        display();
                        break;
                    case 5:
                        System.out.println("Exiting program.");
                        scanner.close(); 
                        return;
                    default:
                        System.out.println("Invalid choice! Please select between 1 to 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 5.");
                scanner.nextLine(); 
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}

