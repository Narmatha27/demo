package addon_dsa;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = a.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = a.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

       
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

      
    }
}
