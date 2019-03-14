
public class Main {
    public static void main(String[] args) throws Exception {
    Resourc.i = 5;
    MyThread myThread = new MyThread();
    myThread.setName("one");
    MyThread myThread2 = new MyThread();

    myThread.start();
    myThread2.start();
    myThread.join();
    myThread2.join();
    System.out.println(Resourc.i);

    }
}
class MyThread extends Thread {
    Resourc resourc;
    public void setResourc(Resourc resourc) {
        this.resourc = resourc;
    }
    @Override
    public void run() {
    Resourc.changeStaticI();
    }
}
class Resourc {
static int i;
 public  static void changeStaticI () {
     int i = Resourc.i;
     if (Thread.currentThread().getName().equals("one")) {
         Thread.yield();
     }
     i++;
     Resourc.i = i;
 }
}
