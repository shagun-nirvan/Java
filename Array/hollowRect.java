package Array;

public class hollowRect {
    public static void rectanglePattern(int totRows, int totColumns) {
        
        //outer loop
        for(int i=1; i<=totRows; i++) {
            //inner -- columns
            for(int j=1; j<=totColumns; j++) {
                 if(i==1 || i==totRows || j==1 || j==totColumns){
                    System.out.print("*");
                 }
                 else{
                    System.out.print(" ");
                 }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int totRows= sc.nextInt();
        // int totColumns = sc.nextInt();
        rectanglePattern(10, 5);
    }
}
