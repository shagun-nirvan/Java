package MathDSA;
import java.util.*;
public class oddEven {
    static boolean isOdd(int n){
        return (n&1) == 1;
    }
    public static void main(String[] args) {
        int n =54;
        System.out.println(isOdd(n));
    }
}
