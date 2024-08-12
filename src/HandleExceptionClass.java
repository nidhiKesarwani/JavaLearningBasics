
class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
public class HandleExceptionClass {
    public static void main(String[] args) {
        int i=2; // normal statement
        int j=0;
        String name = "Trump";
        int arr[] = new int[5];
       // j = 18/i;
        try  // hey java, try this code block
        {
            j = 18/i; // if exception occurs here, it will not reach line 10
           // System.out.println(arr[5]);
            // how to throw the exception
            if(j==0)
                throw new ArithmeticException("Do not want the value as 0!");

            if(name.equals("Trump"))
                throw new MyException("That's a wrong candidate!");

            System.out.println(arr[5]);
        }
        catch (ArithmeticException e){
            System.out.println(e.getLocalizedMessage());
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index of element is out of bound");
        }
        catch (MyException e){
            System.out.println("My exception : "+ e.getLocalizedMessage());
        }
        catch (Exception e){ // if something goes wrong, throw an exception, I'll catch it
            System.out.println("Error : "+e.getLocalizedMessage());
        }

        System.out.println(j);
        System.out.println("Execution ended!");
    }
}
