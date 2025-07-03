package Array;

public class positionOfElement {
    static int binarySearch(int arr[],int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int ans(int arr[],int target){
        int start=0;
        int end = 1;
        while(target>arr[end]){
            int newSt = end+1;
            end = end+ (end-start)*2;  //to double the box value means if the box contains two elements previously now it will contain 4 elements in the box.
            start = newSt; // here we changed the start with new start rather directly initialising it because we have used the previous start to calculate new end.
        
        }
        return binarySearch(arr, target, start, end);

    }

    public static void main(String[] args) {
        int arr[] = {3,5,6,7,9,10,100,130,140,170,190};
        int target = 10;
        System.out.println(ans(arr, target));
    }
}
