package MathDSA;

public class singleElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,4,5,6,3,5};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique = 0;
        for(int num : arr){
            unique ^= num;
        }
        return unique;

    }
}
