public class MainProgramDC {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        System.out.println();

        DecreasingCounter counter2 = new DecreasingCounter(2);

        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        System.out.println();

        DecreasingCounter counter3 = new DecreasingCounter(100);

        counter3.printValue();

        counter3.reset();
        counter3.printValue();

        counter3.decrement();
        counter3.printValue();
    }
}

