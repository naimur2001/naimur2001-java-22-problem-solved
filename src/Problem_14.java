import java.util.Arrays;

//14. Write a Java program to delete all duplicate elements from an array.
public class Problem_14 {
    public static void main(String[] args) {
        int[]  array={4,7,9,12,2,9,6,9,4,1,2,5,2};


        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j]){

                    array[i]=-1;
                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            if (array[i]!=-1){
                System.out.println(array[i]);
            }
        }

    }
}
