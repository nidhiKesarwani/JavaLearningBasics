
interface Computer{
    void code();
}
class Laptop implements Computer{
    @Override
    public void code (){
        System.out.println("Laptop codes!");
    }
}

class Desktop implements Computer{
    @Override
    public void code (){
        System.out.println("Desktop codes!");
    }
}

class Developer{
    // if we use laptop or desktop reference here, we are coupling code tightly,
    // we need to be flexible
    public void develop (Computer comp){
        System.out.println("Computer helps with code!");
        comp.code();
    }
}


public class UseOfInterface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer d = new Developer();
        d.develop(lap);
        d.develop(desk);
    }
}
