package Recursion;
public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println(sorted(arr, 0));
    }
    public static boolean sorted(int[] arr, int ind){
        if(ind == arr.length-1){
            return true;
        }
        return arr[ind] < arr[ind+1] && sorted(arr, ind+1);
    }

}
