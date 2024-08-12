class ThA implements Runnable{
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}

class ThB implements Runnable{
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}

class Counter{
    int count;
    public Counter(int a){
        count = a;
    }
    public synchronized void increment(){
        this.count = this.count+1;
    }

}
public class ThreadsClass {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter(0);

        Runnable obj1 = () -> {
                for (int i=0; i<1000; i++) {
                    c.increment();
                }
        };

        Runnable obj2 = () -> {
            for (int i=0; i<1000; i++){
                c.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        // Without join, main thread will not wait for
        // t1 and t2 to complete and just print the value
        t1.join();
        t2.join();

        System.out.println(c.count);

    }
}
