import java.util.Arrays;

//8. Write a Java program to copy all elements from one array to another array.
public class Problem_8 {
    public static void main(String[] args) {
        int[]  array={4,7,9,3,9,2,6,12,77,89,92};
        int[] array_2nd=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array_2nd[i]=array[i];
        }
        System.out.println("Second array = "+ Arrays.toString(array_2nd));
    }
}
