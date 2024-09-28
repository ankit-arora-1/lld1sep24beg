package print1to100thread;

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
