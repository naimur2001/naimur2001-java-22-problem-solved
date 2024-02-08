//3. Write a Java program to find the sum of all array elements.
public class Problem_3 {
    public static void main(String[] args) {
        int[] array={2,4,5,2,7,3,8,12,};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
        }
        System.out.println("sum of all array elemments = "+sum);
    }
}
