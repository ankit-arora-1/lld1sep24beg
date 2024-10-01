package executorintro;

public class NumberPrinter implements Runnable {
    private int number;

    public NumberPrinter(int i) {
        number = i;
    }

    @Override
    public void run() {
        System.out.println("Printing from thread: " +
                Thread.currentThread().getName() + ": " + number);
    }
}
