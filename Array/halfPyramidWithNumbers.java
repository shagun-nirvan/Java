package Array;

public class halfPyramidWithNumbers {
    public static void invertedPyramid2(int rows) {
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        invertedPyramid2(5);
    }
}
 