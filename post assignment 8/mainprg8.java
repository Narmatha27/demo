package addon_dsa;

import java.util.Scanner;
import java.util.InputMismatchException;

public class mainprg8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input:");
        String input = scanner.nextLine();

        try {
            int intValue = Integer.parseInt(input);
            System.out.println("Input is an integer: " + intValue);
        } catch (NumberFormatException e1) {
            try{
                double doubleValue = Double.parseDouble(input);
                System.out.println("Input is a double: " + doubleValue);
            } catch(NumberFormatException e2){
                System.out.println("Input is a string: " + input);
            }
        }
        scanner.close();
    }
}