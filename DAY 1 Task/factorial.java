package addon_dsa;

import java.util.Scanner;

public class factorial {

        public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact =fact* i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = a.nextInt();
        
        int result = factorial(n); 
        System.out.println(result);
    }
}
