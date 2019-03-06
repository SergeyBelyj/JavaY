public class EnumExample {
    enum CoffeSize {SMALL(100), MEDIUM(200), BIG(300) {
        String getCoffeClass() {
            return "B";
        }
    };
    String coffeClass = "A";
    int mililiters;
    CoffeSize(int i) {
        this.mililiters = i;
    }
    int getMililiters() {
        return mililiters;
    }
    String getCoffeClass () {
        return coffeClass;
    }
    }



    public static void main(String[] args) {
        CoffeSize coffeSize = CoffeSize.BIG;
        System.out.println(coffeSize);
        System.out.println(coffeSize.getMililiters());
        System.out.println(coffeSize.getCoffeClass());
    }
}