package javacore;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<Integer> task = ()->{
            int total = 0;
            for (int i = 0; i <= 100; i++) {
                total +=i;
            }
            return total;
        };
        Future<Integer> future = executorService.submit(task);
        System.out.println("Hasil : "+ future.get());
        executorService.shutdown();
    }
}
