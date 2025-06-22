package Array;

public class prefixSum {
    public static void prefixSum1(int nums[]){
        int sum = 0, max=0;
        int preSum[] = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            preSum[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                preSum[i]=nums[i];

            }
            else{
                preSum[i]=preSum[i-1]+nums[i];
            }
            //System.out.print(preSum[i]+" ");
        }
        for(int i=0; i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                sum = i==0?preSum[j]:preSum[j]-preSum[i-1];
            }
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        prefixSum1(nums);
    }
}
