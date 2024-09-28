package helloworldthread;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter =
                new HelloWorldPrinter();

        System.out.println("Main: " +
                Thread.currentThread().getName());

        Thread t = new Thread(helloWorldPrinter);
        t.start();

        System.out.println("Main: " +
                Thread.currentThread().getName());
    }
}
