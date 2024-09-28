package threads;

public class Client {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        print();
    }

    public static void print() {
        System.out.println("Printing from thread: " +
                Thread.currentThread().getName());
    }
}
