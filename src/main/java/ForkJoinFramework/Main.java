package ForkJoinFramework;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main {
    static long numbOperations = 10000000000L;
    static int numOfThreads = Runtime.getRuntime().availableProcessors();
    public static void main(String[] args) {
        System.out.println(new Date());
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println(pool.invoke(new MyFork(0, numbOperations)));
        System.out.println(new Date());
    }
    static class MyFork extends RecursiveTask<Long> {
        long from, to;

        public MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }

        protected Long compute() {
           if(to - from <= numbOperations/numOfThreads) {
                long j = 0;
               for (long i = from; i < to  ; i++) {
                   j += i;
               }
               return j;
           } else {
                long middle = (to + from) / 2;
                MyFork firstHalf = new MyFork(from, middle);
                firstHalf.fork();
                MyFork secondHalf = new MyFork(middle+1, to);
                secondHalf.fork();
                long secondValue = secondHalf.compute();
                return firstHalf.join() + secondHalf.join();
           }

        }
  }
}
