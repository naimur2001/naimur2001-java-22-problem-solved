import java.util.ArrayList;

//15. Write a Java program to merge two arrays into a third array.
public class Problem_15 {
    public static void main(String[] args) {
        int[]  array_1={6,9,4,1,5,2};
        int[]  array_2={20,7,8,3};
        ArrayList<Integer>array_3=new ArrayList<Integer>();
        for (int i = 0; i < array_1.length; i++) {
            array_3.add(array_1[i]);
        }
        for (int i = 0; i < array_2.length; i++) {
            array_3.add(array_2[i]);
        }
        System.out.println(array_3);
    }
}
