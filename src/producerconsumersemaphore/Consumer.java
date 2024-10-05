package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Object> queue;
    private Semaphore producer;
    private Semaphore consumer;

    public Consumer(Queue queue,
                    Semaphore producer,
                    Semaphore consumer) {
        this.queue = queue;
        this.producer = producer;
        this.consumer = consumer;
    }


    @Override
    public void run() {
        while(true) {
            try {
                consumer.acquire();
                if(queue.size() > 0) {
                    System.out.println("consuming");
                    queue.remove();
                }
                producer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
