class AdvancedAstrology {
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = size; i >= 0; i--) {
            printSpaces(i);
            printStars(size - i);
        }
        System.out.println();
    }

    public static void printChristmasTree(int height) {
        for (int i = height; i >= 0; i--) {
            printSpaces(i);
            printStars((height - i) * 2 - 1);
        }
        for (int i = 0; i <  2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("//printTriangle");
        printTriangle(4);

        System.out.println();

        System.out.println("//printTriangle");
        printChristmasTree(4);
        System.out.println();
        printChristmasTree(10);
    }
}