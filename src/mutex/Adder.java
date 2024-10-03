package mutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    private Lock lock;

    public Adder(Count c, Lock lock) {
        count = c;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++) {
            lock.lock();
            count.val += i;
            lock.unlock();
        }
    }
}
