import java.util.*;


class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name){
       this.age = age;
       this.name = name;
    }

    @Override
    public String toString(){
        return "Student [age= "+age+" , name= "+name+"]";
    }
    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else return -1;
    }
}
public class Sorting {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(11);
        nums.add(65);
        nums.add(13);
        nums.add(52);
        nums.add(18);

        //Collections.sort(nums);


        // customizing sort, giving comparator
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer n, Integer m) {
                if(n%10 > m%10)  // if n's last digit is bigger than m's last digit
                    return 1;  // then swap
                else
                    return -1; // 0 won't work here
            }
        };

        Collections.sort(nums, comp);
        for(Integer a : nums){
            System.out.println(a);
        }





        List<Student> studs = new ArrayList<Student>();

        studs.add(new Student(21, "navin"));
        studs.add(new Student(12, "nidhi"));
        studs.add(new Student(18, "sona"));
        studs.add(new Student(20, "palak"));

        Collections.sort(studs);

        for(Student s : studs){
            System.out.println(s);
        }
    }
}
