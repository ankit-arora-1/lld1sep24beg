package producerconsumerintro;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Client {
    public static void main(String[] args) {
        Queue<Object> queue = new ConcurrentLinkedQueue<>();

        Producer p1 = new Producer(queue);
        Producer p2 = new Producer(queue);
        Producer p3 = new Producer(queue);
        Producer p4 = new Producer(queue);
        Producer p5 = new Producer(queue);
        Producer p6 = new Producer(queue);

        Consumer c1 = new Consumer(queue);
        Consumer c2 = new Consumer(queue);
        Consumer c3 = new Consumer(queue);
        Consumer c4 = new Consumer(queue);
        Consumer c5 = new Consumer(queue);

        Thread tp1 = new Thread(p1);
        Thread tp2 = new Thread(p2);
        Thread tp3 = new Thread(p3);
        Thread tp4 = new Thread(p4);
        Thread tp5 = new Thread(p5);
        Thread tp6 = new Thread(p6);

        Thread tc1 = new Thread(c1);
        Thread tc2 = new Thread(c2);
        Thread tc3 = new Thread(c3);
        Thread tc4 = new Thread(c4);
        Thread tc5 = new Thread(c5);

        tp1.start();
        tp2.start();
        tp3.start();
        tp4.start();
        tp5.start();
        tp6.start();

        tc1.start();
        tc2.start();
        tc3.start();
        tc4.start();
        tc5.start();
    }
}
