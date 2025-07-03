package Array;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        
    }

    public int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;
        for(int i=0; i<nums.length;i++){
            start = Math.max(start,nums[i]); //in the end of the loop this will contain the max element.
            end += nums[i];
        }
 
        //binary search

        while(start<end){
            //try for middle as the potential answer
            int mid = start + (end-start)/2;
            
            //calculate how many pieces you can divide this in with this max sum
            int sum =0;
            int pieces = 1;
            for(int num:nums){
                if(sum+num >mid){
                    //ypu can not add this in this subarray, make a new one 
                    //say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces>m){
                start = mid+1;
            }else{
                end=mid;
            }
        }
        return end;  //here start == end
    }
}
