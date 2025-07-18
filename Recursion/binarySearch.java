package Recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,11,14,16,19};
        int target = 14;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        }
        if(arr[m]<target){
            return search(arr, target, m+1, e);
        }
        else{
            return search(arr, target, s, m-1);
        }
        

    }
}
