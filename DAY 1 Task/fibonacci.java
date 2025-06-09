package addon_dsa;

import java.util.Scanner;

public class fibonacci {


	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("number of terms: ");
	        int n = scanner.nextInt();

	        System.out.println("Fibonacci Series:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	        int total=fibonacci(n);
	        System.out.println(total);
	    }
	}


