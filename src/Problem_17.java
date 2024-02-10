import java.util.Arrays;

//17. Write a Java program to put even and odd elements of an array into two separate arrays.
public class Problem_17 {
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
        System.out.println("Even array = "+ Arrays.toString(even_array));
        System.out.println("Odd array = "+ Arrays.toString(odd_array));

    }
}
