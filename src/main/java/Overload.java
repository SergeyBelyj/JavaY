import java.io.IOException;

public class Overload {
    int addTwoDigits(int a, int b) throws IOException {
        return a + b;
    }
    double addTwoDigits(double a, double b) throws RuntimeException {
        return a + b;
    }

    public static void main(String[] args) throws Exception {
        ChildOverload overload = new ChildOverload();
        System.out.println(overload.addTwoDigits(5,6));
        System.out.println(overload.addTwoDigits(2.4,3.6));
        overload.addTwoDigits(5);
    }
    static class  ChildOverload extends Overload {
        void addTwoDigits(int i) {
            System.out.println("overload method");
        }
    }
}
