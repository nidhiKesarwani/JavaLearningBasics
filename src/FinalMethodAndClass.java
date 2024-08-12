

// Final
// variable : can't change it later
// class : can't inherit it
// method :  can't override it
class Calc{
   public final void show(){
       System.out.println("By Calc");
   }
}

// if I make Calc as final, I can't inherit it
class AdvCalc extends Calc{
    // doesn't work as the method is final
//    public void show(){
//        System.out.println("By AdvCalc");
//    }

    public void show2(){
        System.out.println("in adv");
    }
}
public class FinalMethodAndClass {

    public static void main(String[] args) {
        Calc c = new AdvCalc(); // parent can be reference to child class
        // AdvCalc ac = new Calc(); // child class can't be reference to parent object
        c.show();
        // c.show2(); // not possible
        // why? because reference is of type parent and parent doesn't have show2

        // we can downcast the reference
        AdvCalc av = (AdvCalc) c;
        av.show2();  // works
    }

}
