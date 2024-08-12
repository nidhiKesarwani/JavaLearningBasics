
// Replace "abstract class" with interface if all the methods are abstract
// Interfaces don't have their own memory in heap so they can't have non-final variable
interface InterfaceA {
    //these methods are by default public abstract
    void show();
    void fly();

    // variables are by default final and static in interfaces
    // which means it's common for all objects and can't be changed later
    int age = 28;
}

class Child implements InterfaceA{

    @Override
    public void show() {
        System.out.println("Showing..");
    }

    @Override
    public void fly() {
        System.out.println("Flying..");
    }

    public void look(){
        System.out.println("Looking");
    }

}
public class InterfaceClass {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        // a.look();
    }
}
