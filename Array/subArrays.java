package Array;

public class subArrays {
    public static void printSubarray(int numbers[]){
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<numbers.length;i++){
            
            for(int j=i;j<numbers.length;j++){
                sum = 0;
                for(int k=i;k<=j;k++){
                    //System.out.print(numbers[k]+" ");
                    sum = sum+numbers[k];
                }
                System.out.print(sum  +" ");
                if(max<sum){
                    max=sum;
                }   
                
            }
            System.out.println();
        }
       System.out.println("MAX SUM:"+ max);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarray(numbers);
    }
}
