package Recursion;

public class dice {
    public static void main(String[] args) {
        pattern("", 8);
    }
    static void pattern(String p, int target){
        if(target==0){
            System.out.print(p+ " ");
            return;
        }

        for(int i=1;i<=6 && i<=target;i++){
            pattern(p+i, target-i);
        }
    }
}
