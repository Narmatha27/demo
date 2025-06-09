package addon_dsa;

import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
        
        System.out.print("Enter index to insert at: ");
        int insertPos = sc.nextInt();
        System.out.print("Enter value to insert: ");
        int insertVal = sc.nextInt();

        int[] insertArr = new int[arr.length + 1];

        for (int i = 0; i < insertPos; i++) {
            insertArr[i] = arr[i];
        }
        insertArr[insertPos] = insertVal;
        for (int i = insertPos; i < arr.length; i++) {
            insertArr[i + 1] = arr[i];
        }

        System.out.print("After Insertion at index " + insertPos + ": ");
        for (int val : insertArr) System.out.print(val + " ");
        System.out.println();
    }
}