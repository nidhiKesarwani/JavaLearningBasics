import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyBlockClass {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = null;

        // finally is used to run definite steps
        // irrespective of exception

        try{
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        finally {
            bf.close();
            System.out.println("Execution ended!");
        }


        try(BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt(bf1.readLine());
            System.out.println(num);
        }

        // bf1 will close automatically as its parent extends closeable
    }
}
