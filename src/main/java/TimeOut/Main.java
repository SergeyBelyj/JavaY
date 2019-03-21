package TimeOut;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
       System.out.println(ThreadLocalRandom.current().nextInt());
        System.out.println((TimeUnit.DAYS.toMillis(14)));
    }
}
