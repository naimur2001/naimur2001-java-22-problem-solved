import java.util.Arrays;

//21. Write a Java program to left rotate an array.
public class Problem_21 {
    public static void main(String[] args) {
        int[]  array={6,9,4,1,5,2,3};
        int position=2;
        for (int i = 0; i < position; i++) {
            int first=array[0];
            int j;
            for ( j = 0; j < array.length-1; j++) {
                array[j]=array[j+1];
            }
            array[j]=first;
        }
        System.out.println("left rotate array = "+Arrays.toString(array));
    }
}
