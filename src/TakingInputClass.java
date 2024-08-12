import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingInputClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Hi");
     //   int num = System.in.read(); // takes only one character at a time and returns its ASCII value

        int numNew=0;
        // Old method
        /*
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        numNew = Integer.parseInt(bf.readLine());
        bf.close();
       */

        // New Method
        Scanner sc = new Scanner(System.in);
        numNew = sc.nextInt();
        System.out.println(numNew);
    }
}
