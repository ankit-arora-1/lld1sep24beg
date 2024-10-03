package producerconsumerintro;

import java.util.Objects;
import java.util.Queue;

public class Producer implements Runnable {
    private Queue<Object> queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                if(queue.size() < 6) {
                    System.out.println("producing");
                    queue.add(new Object());
                }
            }
        }
    }
}
