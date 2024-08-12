

class AClass{
    int age;
    public void show(){
        System.out.println("In show");
    }

    class Bclass{
        public void showInner(){
            System.out.println("In innerShow");
        }
    }

}

class C{
    public void show(){
        System.out.println("In C show");
    }
}
public class InnerClass {
    public static void main(String[] args) {
        AClass obj = new AClass();
        AClass.Bclass obj1 = obj.new Bclass();

        obj1.showInner();


        // When we create the object of class C, what if we want to override the show method
        // we do it while making the object..
        C c = new C()
        { // anonymous class
            public void show(){
                System.out.println("In overriden C show");
            }
        };

        c.show();
    }
}
