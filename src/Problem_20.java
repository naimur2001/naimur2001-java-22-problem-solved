import java.util.Arrays;

//20. Write a Java program to sort even and odd elements of an array separately.
public class Problem_20 {
    public static void main(String[] args) {
        int[]  array={4,7,9,3,9,2,6,12,77,89,92};
        int even_count=0;
        int odd_count=0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==1){
                odd_count++;
            }
            else {
                even_count++;
            }
        }
        int[] even_array=new int[even_count];
        int[] odd_array=new int[odd_count];
        int even_ind=0;
        int odd_ind=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==1){
                odd_array[odd_ind++]=array[i];

            }
            else {
                even_array[even_ind++]=array[i];
            }
        }
        //array sorting as descending order
        for (int i = 0; i < even_array.length; i++) {
            for (int j = 0; j< even_array.length-1; j++) {
                if (even_array[i]>even_array[j]){
                    int swap=even_array[j];
                    even_array[j]=even_array[i];
                    even_array[i]=swap;
                }
            }
        }

        //array sorting as ascending order
        for (int i = 0; i <odd_array.length; i++) {
            for (int j = 0; j< odd_array.length-1; j++) {
                if (odd_array[i]<odd_array[j]){
                    int swap=odd_array[j];
                    odd_array[j]=odd_array[i];
                    odd_array[i]=swap;
                }
            }
        }
        System.out.println("Ascending Odd array = "+Arrays.toString(odd_array));
        System.out.println("Descending Even array = "+Arrays.toString(even_array));

    }
}
