import java.util.Arrays;

//1. Write a Java program to read and print elements of an array.
public class Problem_1 {
    public static void main(String[] args) {
        System.out.println("Number Array");
       int[] number_array={2,4,5,2,1,7,9,3,6,8};
        for (int i = 0; i < number_array.length; i++) {
            System.out.println(number_array[i]);

        }

        System.out.println("Char Array");
        char[] char_array={'s','h','u','v','o'};
        for (int i = 0; i < char_array.length; i++) {
            System.out.println(char_array[i]);
        }


    }
}