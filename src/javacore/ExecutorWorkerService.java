package javacore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorWorkerService {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add(i);
        }
        ExecutorService executor =  Executors.newFixedThreadPool(4);
        int batchSize = 25;

        for (int i = 0; i < 4; i++) {
            int start = i * batchSize;
            int end = start + batchSize;

            List<Integer> batch = data.subList(start,end);
            executor.submit(()->{
                for (Integer item : batch) {
                    System.out.println(Thread.currentThread().getName() + " memproses data " + item);
                }
            });
        }
        executor.shutdown();
    }
}
