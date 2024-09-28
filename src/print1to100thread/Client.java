package print1to100thread;

public class Client {
    public static void main(String[] args) {
        for(int i = 1; i < 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t = new Thread(numberPrinter);
            t.start();
        }

        // 1. join() method in thread
        // 2. Lifecycle of a thread
    }
}
