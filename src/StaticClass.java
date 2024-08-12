class Mobile{
    private int price;
    static String name;

    // Static block to initialize the static variables only once,
    // not for each object
    static{
        name = "RealMe";
        System.out.println("Static block");
    }

    public Mobile(int price){
        this.price = price;
        System.out.println("Parameterized Constructor");
    }

    public static void show(Mobile m){
        System.out.println(name);
        // we can't use the instance variable directly in static methods
        // we have to use pass some object to reference it, as we are not sure
        // which object's price are we talking about.
        System.out.println(m.price);
    }
}
public class StaticClass {

    // if we don't make main as static, we can't call it without
    // making object of the class
    public static void main(String[] args) throws ClassNotFoundException {
//        Mobile m = new Mobile(12);
//        Mobile n = new Mobile(14);
//        Mobile p = new Mobile(15);

        //        *****************OUTPUT*************
        //        Static block
        //        Parameterized Constructor
        //        Parameterized Constructor
        //        Parameterized Constructor

        // how to load the class without creating an object:
          Class.forName("Mobile");
        // class loads and then objects are instantiated
        // class only loads once, so does the static members and blocks with it.
        // static constructor as it belongs to the class

        //        *****************OUTPUT*************
        //        Static block



        Mobile o = new Mobile(12);
        // we can't do this
        // o.show();
        // we have to pass the object as parameter to access the instance variable
        Mobile.show(o);
    }

}
