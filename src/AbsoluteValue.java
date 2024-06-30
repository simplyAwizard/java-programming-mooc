import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(input.nextLine());
        if (num < 0) {
            System.out.println(num * -1);
        }
        else {
            System.out.println(num);
        }
    }
}