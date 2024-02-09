import java.util.Arrays;

//10. Write a Java program to delete an element from an array at a specified position.
public class Problem_10 {
    public static void main(String[] args) {
        int[]  array={4,7,9,12,2,89,6,92};
        int[]  array_2nd=new int[array.length-1];
        int position=2;
        for (int index = 0; index < array.length; index++) {

            if (index<position){

                array_2nd[index]=array[index];
            }
           else {
                array_2nd[index-1]=array[index];
            }
        }
        System.out.println("After removing elements = "+ Arrays.toString(array_2nd));
    }
}
