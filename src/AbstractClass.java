
/*
we can inherit the abstract class but can't instantiate
Abstract class might or might not have abstract method
If the child class doesn't implement all the abstract methods, it becomes abstract itself
*/
abstract class Car{
    //this method is defined
    public void playMusic(){
        System.out.println("Playing music..");
    }

    //this method is just declared
   // public void drive();

    // but we can't just declare, we have to make it abstract
    public abstract void drive();
    public abstract void fly();
}

// extending the abstract class means we have to define all the abstract methods
abstract class WagonR extends Car{
   public void drive(){
       System.out.println("Driving..");
   }

   public void clean(){
       System.out.println("Cleaning..");
   }
}

class UpdatedWagonR extends WagonR{ // Concrete class
   public void fly(){
       System.out.println("Flying..");
   }

}
public class AbstractClass {
    public static void main(String[] args) {

       // Car c = new Car(); // can't create an object
//        Car c = new WagonR();
//        ((WagonR)c).clean(); // can't call as Car doesn't know the method clean

        Car c = new UpdatedWagonR();
        ((WagonR)c).clean();
    }
}
