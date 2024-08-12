// A is extending Object class by default
class A{
   public A(){
       super();
       System.out.println("In A");
   }

    public A(int a ){
        System.out.println("In A param");
    }
}

class B extends A{
    public B(){
       // super(); // by default
        System.out.println("In B");
    }

    public B(int b){
        // super(); // by default
       // super(b);
        // if we want to call the other constructor of B
        this();
        System.out.println("In B param");
    }

    public void show(){
        System.out.println("in show");
    }

}
public class ThisAndSuperClass {
    public static void main(String[] args) {
 //           B b = new B();

//        Output
//        In A
//        In B


        B b = new B(12);

//        Output
//        In A param
//        In B param

        // what if we want to call both the constructors of B

        new B().show(); // anonymous object, can't reuse it

    }
}
