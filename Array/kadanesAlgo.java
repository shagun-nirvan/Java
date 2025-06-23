package Array;
import java.util.*;
public class kadanesAlgo {
    public static void kadane(int nums[]) {
        // int currSum[] = new int[nums.length];
        // int maxSum[] = new int[nums.length];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);

        //     if (i == 0) {
        //         currSum[i] = nums[i];
        //         if (currSum[i] < 0) {
        //             currSum[i] = 0;
        //         }
        //     } else {
        //         if (currSum[i - 1] + nums[i] < 0) {
        //             currSum[i] = 0;
        //         } else {
        //             currSum[i] = currSum[i - 1] + nums[i];
        //         }

        //     }
        //     if (maxSum < currSum[i]) {
        //         maxSum = currSum[i];
        //     }
        // }
        // System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadane(nums);
    }
}
