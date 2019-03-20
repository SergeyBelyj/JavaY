package executers;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyRannable());
        System.out.println(executorService.submit(new MyCallable()).get());
        executorService.shutdown();
    }
    static class MyRannable implements Runnable {

        public void run() {
            System.out.println("1");
        }
    }
    static class MyCallable implements Callable<String> {

        public String call() throws Exception {
            return "2";
        }
    }
}
