package addon_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static void binary(int arr[]) {
        System.out.println("Enter the number to find:");
        Scanner sc = new Scanner(System.in);
        int find = sc.nextInt();
        boolean flag=false;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == find) {
                System.out.println("Value " + find + " found at index " + mid);
                flag=true;
                break;
            
            }
            else if (find > arr[mid]) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        if(flag==false)
        System.out.println("Value " + find + " not found in the array.");
       
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 42, 12, 14, 11, 34, 56, 65, 3};
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        binary(arr);
    }
}
