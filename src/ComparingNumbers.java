import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the second number: ");
        int n2 = Integer.parseInt(scanner.nextLine());

        if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        }
        else if (n1 < n2) {
            System.out.println(n1 + " is less than " + n2);
        }
        else {
            System.out.println(n1 + " is equal to " + n2);
        }
    }
}