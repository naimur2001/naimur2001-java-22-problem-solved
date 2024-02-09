//11. Write a Java program to count the frequency of each element in an array.
public class Problem_11 {
    public static void main(String[] args) {
        int[]  array={4,7,9,12,2,9,6,9,4,1,2,5,2};

        for (int i = 0; i < array.length; i++) {
            int count=0;
            int check=array[i];
            if (check==-1)continue;
            for (int j = 0; j < array.length; j++) {
                if (array[j]==check){
                    count++;
                    array[j]=-1;
                }
            }
            System.out.println(check+" "+ count);

        }
    }
}
