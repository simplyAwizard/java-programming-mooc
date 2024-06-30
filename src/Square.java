// Making the scanner available to the program
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        // Creating the scanner
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter a number to square: ");
        // Read an integer input from the user, then square it
        int num = Integer.parseInt(input.nextLine());
        int square = num * num;

        System.out.println("The square of " + num + " is " + square);
    }
}