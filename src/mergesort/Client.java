package mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(2,5,1,3,4,6,8,7);
        ExecutorService executorService =
                Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(list, executorService);



        Future<List<Integer>> sortedArrayFuture =
                executorService.submit(sorter);

        System.out.println("Doing some other work");
        System.out.println("Doing some more work");

        System.out.println(sortedArrayFuture.get());
    }
}
