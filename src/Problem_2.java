//2. Write a Java program to print all negative elements in an array.
public class Problem_2 {
    public static void main(String[] args) {
        int[] number_array={2,4,-5,2,-1,7,-9,3,-6,8,12,-15};

        for (int i = 0; i < number_array.length; i++) {
            if (number_array[i]<0) {
                System.out.println(number_array[i]);
            }
        }
    }
}
