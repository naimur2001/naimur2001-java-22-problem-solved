import java.util.ArrayList;
import java.util.Arrays;

//15. Write a Java program to merge two arrays into a third array.
public class Problem_15 {
    public static void main(String[] args) {
        int[]  array_1={6,9,4,1,5,2};
        int[]  array_2={20,7,8,3};
//        ArrayList<Integer>array_3=new ArrayList<Integer>();
        int[] array_3=new int[array_1.length+ array_2.length];
        for (int i = 0; i < array_1.length; i++) {
            array_3[i]=array_1[i];
        }
        for (int i = 0; i < array_2.length; i++) {
            array_3[array_1.length+i]=array_2[i];
        }
        System.out.println(Arrays.toString(array_3));
    }
}
