//4. Write a Java program to find the maximum and minimum element in an array.
public class Problem_4 {
    public static void main(String[] args) {
        int[] array={2,4,5,7,3,8,12,20};
int max=0;
int min=0;
        for (int i = 0; i < array.length; i++) {
         max=array[i];
         min=array[i];
            for (int j = 0; j <array.length ; j++) {
                if (max<array[j] ){
                    max=array[j];

                } else if ( min>array[j]) {
                    min=array[j];
                }
            }
        }
        System.out.println("Maximum element = "+max);
        System.out.println("Minimum element = "+min);
    }
}
