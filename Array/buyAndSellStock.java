package Array;
import java.util.*;
public class buyAndSellStock {
    public static int stocks(int nums[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
      for(int i=1;i<nums.length;i++){
        buyPrice = Math.min(buyPrice,nums[i-1]);
        int profit = nums[i] - buyPrice;
        maxProfit = Math.max(maxProfit,profit);
      }
      return maxProfit;
    }
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        System.out.println("MAX PROFIT :"+stocks(nums));
    }
}





//CODE IF WE WANT TO PRINT THE DAY OF BUYING AND SELLING


// package Array;
// import java.util.*;

// public class buyAndSellStock {
//     public static int stocks(int nums[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         int buyIndex = -1;
//         int sellIndex = -1;

//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i - 1] < buyPrice) {
//                 buyPrice = nums[i - 1];
//                 buyIndex = i - 1;
//             }

//             int profit = nums[i] - buyPrice;

//             if (profit > maxProfit) {
//                 maxProfit = profit;
//                 sellIndex = i;
//             }
//         }

//         System.out.println("Buy on day: " + buyIndex + " (Price: " + nums[buyIndex] + ")");
//         System.out.println("Sell on day: " + sellIndex + " (Price: " + nums[sellIndex] + ")");
//         return maxProfit;
//     }

//     public static void main(String[] args) {
//         int nums[] = {7, 1, 5, 3, 6, 4};
//         System.out.println("MAX PROFIT: " + stocks(nums));
//     }
// }
