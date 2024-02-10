import java.util.Arrays;

//19. Write a Java program to sort array elements in ascending or descending order.
public class Problem_19 {
    public static void main(String[] args) {
        int[] array={1,22,4,5,2,3,8,12,18,9};


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
        System.out.println("Descending = "+Arrays.toString(array));
        //array sorting as ascending order
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j< array.length-1; j++) {
                if (array[i]<array[j]){
                    int swap=array[j];
                    array[j]=array[i];
                    array[i]=swap;
                }
            }
        }
        System.out.println("Ascending = "+Arrays.toString(array));

    }
}
