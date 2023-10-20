package Programming;


import java.util.Arrays;
import java.util.Random;

public class Array_Shuffle {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7};
        
  
        int[] b = Arrays.copyOf(a, a.length);
        shuffleArray(b);
        
        System.out.println("Original Array: " + Arrays.toString(a));
        System.out.println("Shuffled Array: " + Arrays.toString(b));
    }
    
    public static void shuffleArray(int[] arr) {
        Random res =new Random();
        for (int i=arr.length-1;i>0;i--) {
            int index = res.nextInt(i+1);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
