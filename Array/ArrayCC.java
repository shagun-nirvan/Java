package Array;
import java.util.*;

public class ArrayCC {
    public static void main(String[] args) {
        int marks[] = new int[50];

        //input
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();//phy
        marks[1] = sc.nextInt();//chem
        marks[2] = sc.nextInt();//math

        //output
        System.out.println("phy: "+ marks[0]);
        System.out.println("chem: "+ marks[1]);
        // System.out.println("maths: "+ marks[2]);

        //update
        marks[2] = 100;
        System.out.println("maths: "+ marks[2]);
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage: "+ percentage+ "%");


        //Method to print array length

        System.out.println("length : " + marks.length);

       // int numbers[] = {1,2,3}; if size is not initiated then java will automatically initiate the size during runtime on the basis of inputs in the array
        
         
    }
}
