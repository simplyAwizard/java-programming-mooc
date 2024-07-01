public class StarSign {
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int number) {
        for (int i = 0; i < number; i++) {
            printStars(number);
        }
        System.out.println();
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
        System.out.println();
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size + 1; i++) {
            printStars(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("//printStars");
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println();

        System.out.println("//printSquare");
        printSquare(4);

        System.out.println("//printRectangle");
        printRectangle(17, 3);

        System.out.print("//printTriangle");
        printTriangle(3);
    }
}