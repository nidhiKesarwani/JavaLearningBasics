import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
//        Collection nums = new ArrayList();
//        nums.add(1);
//        nums.add(2);
//        nums.add("3");
//
//        for(Object n : nums){
//
//            // This will be a runtime issue
//            // while no compilation error
//            // so it's good to provide type of the
//            // collection while creating it..
//            int num = (Integer)n;
//
//            System.out.println(n);
//        }

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums.get(2));
    }
}
