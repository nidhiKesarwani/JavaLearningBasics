import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);


        /*

        // Creating a consumer

        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        Consumer<Integer> con1 = (i) -> System.out.println(i);
        nums.forEach(con1);

        System.out.println("==========================");
        nums.forEach(i -> System.out.println(i));
        */

        // STREAMS

        Stream<Integer> s1 = nums.stream();
        s1.forEach(n -> System.out.println(n));
        // one stream won't work twice,
        // and it doesn't make any changes in the input
        // it is a runtime error not compilation
       // s1.forEach(n -> System.out.println(n));

        System.out.println("==========================");

        Stream<Integer> s2 = nums.stream();
     //   s2.filter(n -> n%2==0); // returns a new stream, we can save it

        Stream<Integer> s3 = s2.filter(n -> n%2==0);
        s3.forEach(n -> System.out.println(n));


        System.out.println("==========================");

        Stream<Integer> st1 = nums.stream();
        Stream<Integer> st2 = st1.filter(n -> n%2==0);
        Stream<Integer> st3 = st2.map(n -> n*2);
        Integer result = st3.reduce(0, (i, j) -> i+j);

        // We can do all this in one chain

        Integer res = nums.stream()
                          .filter(n -> n%2==0)
                          .map(n -> n*2)
                          .reduce(0, (i, j)-> (i+j));

    }
}
