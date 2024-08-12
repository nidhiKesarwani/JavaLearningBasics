
@FunctionalInterface
interface FInterfaceA{
    public void addTen(int a);

    //can't have more than one method
    // public void write();
}

@FunctionalInterface
interface FInterfaceB{
    public int add(int a, int b);
}
public interface FunctionalInterfaceClass {

    public static void main(String[] args) {
        FInterfaceA obj = (a) -> {
            a = a+10;
            System.out.println("in show : "+a);
        };
        /*
         () -> System.out.println("in addTen");
         this is the way to define the method addTen, as we have only one
         similarly for parameter:
         (a) -> System.out.println("in addTen : "+a);


         if we want to write more functionality
        */

        obj.addTen(2);
        //lambda expression were introduced in java 8

        FInterfaceB objb = (a, b) -> a+b;
        System.out.println(objb.add(2, 3));

    }
}
