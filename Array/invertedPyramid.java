package Array;

public class invertedPyramid {
    public static void halfPyramid(int rows) {
        for(int i=1; i<=rows; i++){
            //spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            //stars
             for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) { 
        halfPyramid(7);
    }
}
