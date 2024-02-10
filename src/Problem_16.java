import java.util.Arrays;

//16. Write a Java program to find the reverse of an array.
public class Problem_16 {
    public static void main(String[] args) {
        int[]  array={6,9,4,1,5,2};
        int[] reverse_array=new int[array.length];
        for (int i = 0; i <array.length; i++) {
       reverse_array[i]=array[(array.length-1)-i];
        }
        System.out.println("Reversed array = "+Arrays.toString(reverse_array));
    }
}
