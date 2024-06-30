import java.util.Scanner;
import java.text.DecimalFormat;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number to sum: ");
        double n1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the second number to sum: ");
        double n2 = Double.parseDouble(scanner.nextLine());

        double sum = n1 + n2;

        DecimalFormat df = new DecimalFormat("#.###");
        String formattedSqrt = df.format(Math.sqrt(sum));
        System.out.println("The sum of the two digits is: " + sum + " and the square root is: " + formattedSqrt);
    }
}