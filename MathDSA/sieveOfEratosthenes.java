package MathDSA;

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] arr = new boolean[n+1];
        sieve(n, arr);
    }
    static void sieve(int n, boolean[] arr){
// false in array means number is prime
        for(int i=2;i*i<=n;i++){
            if(!arr[i]){
                for(int j= i*2;j<=n;j+=i){
                    arr[j] = true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!arr[i]){
                System.out.print(i+ " ");
            }
        }

    }
}
