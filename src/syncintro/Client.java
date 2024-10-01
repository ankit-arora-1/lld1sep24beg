package syncintro;

import constructorchaining.A;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        count.val = 0;

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.val);

        /*
        * x = x + 1;
        * temp <- x
        * temp = temp + 1
        * x <- temp
        * */
    }
}
