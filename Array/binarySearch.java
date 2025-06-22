package Array;

public class binarySearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end=numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid]<key){
                end= mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {3, 5,49,32,2,12,65,86,5,8,82,17};
        int key = 12;
        System.out.println("FOUND AT INDEX : " + binarySearch(numbers, key));
    }
}
