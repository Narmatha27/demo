package addon_dsa;
import java.util.Scanner;
public class descending_order {
	public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        int[] arr = new int[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.println("Original Array:");
	        printArray(arr);

	        sortDescending(arr);

	        System.out.println("Sorted Array in Descending Order:");
	        printArray(arr);

	        scanner.close();
	    }

	   
	    public static void sortDescending(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] < arr[j]) {
	                  
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	    }

	   
	    public static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    
	}


}
