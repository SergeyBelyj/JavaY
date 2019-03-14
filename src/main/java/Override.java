class   ParentOv {
   ParentOv method() throws Exception{
        return new ParentOv();
    }
    static class Child extends ParentOv {
        @java.lang.Override
       Child method() throws RuntimeException {
            return new Child();
        }
    }

public static class Override {
    public static void main(String[] args) throws Exception {
        ParentOv parent = new ParentOv();
        ParentOv child = new Child();
        System.out.println(parent.method());
        System.out.println(child.method());
    }
}
}