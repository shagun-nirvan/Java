package Array;
import java.util.*;
public class largestNumber {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];

            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {21,23,39,87,43,32,54,56,87}; 
        System.out.println("LARGEST NUMBER:" + getLargest(numbers));
    }
}
  