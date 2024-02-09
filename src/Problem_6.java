//6. Write a Java program to count the total number of even and odd elements in an array.
public class Problem_6 {
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
        System.out.println("Even elements = "+even_count);
        System.out.println("Odd elements = "+odd_count);

    }
}
