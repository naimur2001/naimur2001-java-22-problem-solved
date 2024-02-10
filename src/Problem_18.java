//18. Write a Java program to search for an element in an array.
public class Problem_18 {
    public static void main(String[] args) {
        int[]  array={6,9,4,1,5,2,3};
        boolean found=false;
        int element=1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==element){
                found=true;
                break;
            }
        }
        if (found){
            System.out.println(element + " Found");
        }
        else {
            System.out.println("Not Found");
        }

    }
}
