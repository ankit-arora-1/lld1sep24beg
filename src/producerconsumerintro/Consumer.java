package producerconsumerintro;

import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Object> queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        while(true) {
            synchronized (queue) {
                if(queue.size() > 0) {
                    System.out.println("consuming");
                    queue.remove();
                }
            }
        }
    }
}
