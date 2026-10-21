package javacore;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        Future<Integer> result = executorService.submit(()->{
//            int total = 0;
//            for (int i = 1; i <= 100 ; i++) {
//                total += i;
//            }
//            return total;
//        });
//        System.out.println("Task berhasil dikirim");
//        Integer value = result.get();
//        System.out.println("Hasil : "+ value);
//        executorService.shutdown();

        Future<Integer> future = executorService.submit(()->{
            try {
                Thread.sleep(3000);
                return 100;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(future.get());
        executorService.shutdown();
    }
}
