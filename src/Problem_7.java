//7. Write a Java program to count the total number of negative elements in an array.
public class Problem_7 {

    public static void main(String[] args) {
        int[] array={2,4,-5,2,-1,7,-9,3,-6,8,-15};
        int negative_count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<0){
            negative_count++;
            }
        }
        System.out.println("Negative elements = "+ negative_count);

    }

}
