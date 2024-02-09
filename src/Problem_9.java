import java.util.Arrays;

//9. Write a Java program to insert an element into an array.
public class Problem_9 {
    public static void main(String[] args) {
        int[]  array={4,7,9,3,12,77,2,89,6,92};
        int insert_element=30;
        int[] array_2nd=new  int[array.length+1];
        for (int i = 0; i < array.length; i++) {
           array_2nd[i]=array[i];
        }
  array_2nd[array_2nd.length-1]=insert_element;
        System.out.println( "After inserting element = "+Arrays.toString(array_2nd));
    }
}
