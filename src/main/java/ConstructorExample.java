class Parent {
    Parent() {
        System.out.println("Parent write");
    }
}

public class ConstructorExample extends Parent{
   ConstructorExample() {
       System.out.println("ConstructorExample write");
    }

    public static void main(String[] args) {
        new ConstructorExample();
    }
}
