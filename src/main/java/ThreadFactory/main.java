package ThreadFactory;

import java.util.concurrent.ThreadFactory;

public class main {
    public static void main(String[] args) {
        ThreadFactory threadFactory = new ThreadFactory() {
            public Thread newThread(Runnable runnable) {

                Thread thread = new Thread(runnable);
               thread.setPriority(Thread.MAX_PRIORITY);
               return thread;
            }
        };
        threadFactory.newThread(new MyRun()).start();


    }
    static class  MyRun implements Runnable {
        public void run() {
            System.out.println(1);
        }
    }
}
