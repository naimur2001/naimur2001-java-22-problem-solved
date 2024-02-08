import java.util.Arrays;

//5. Write a Java program to find the second largest element in an array.
public class Problem_5 {
    public static void main(String[] args) {
        int[] array={1,22,4,5,2,3,8,12,18,9};

        int max_2=0;
//array sorting as descending order
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j< array.length-1; j++) {
             if (array[i]>array[j]){
                 int swap=array[j];
                 array[j]=array[i];
                 array[i]=swap;
             }
            }
        }


        for (int i = 0; i < array.length; i++) {
            max_2=array[1];
            if(array[i]>max_2){
                max_2=array[i];
            }
        }


        System.out.println("Second largest element = "+max_2);
    }
}
