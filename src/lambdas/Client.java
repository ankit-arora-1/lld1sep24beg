package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        // Lambdas are only valid for Single Abstract Methods
        // Lambdas are anonymous implementation of single abstract methods
        Thread t = new Thread(() -> {
            System.out.println("Hello world from thread: " +
                    Thread.currentThread().getName());
        });

        t.start();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);

//        Collections.sort(list,  (Integer i1, Integer i2) -> {
//            if(i1 > i2) {
//                return 1;
//            } else if(i1 < i2) {
//                return -1;
//            }
//
//            return 0;
//        });

//        Collections.sort(list,  (Integer i1, Integer i2) -> {
//            return i1 - i2;
//        });

//        Collections.sort(list,  (i1, i2) -> {
//            return i1 - i2;
//        });

        Collections.sort(list,  (i1, i2) -> i1 - i2);

        System.out.println(list);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(() -> {
            System.out.println("Hello world");
        });
    }
}
