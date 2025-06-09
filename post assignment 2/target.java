package addon_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class target {

    public static boolean swap(int[] arr, int t) {
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == t) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + t);

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    return true;  
                }
            }
        }
        return false;  
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array separated by spaces:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target  (t): ");
        int t = sc.nextInt();
        if (swap(arr, t)) {
            System.out.println("Swapped array: " + Arrays.toString(arr));
        } else {
            System.out.println("No two numbers found with sum = " + t);
        }

        sc.close();
    }
}
