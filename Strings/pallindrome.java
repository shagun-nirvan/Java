package Strings;

public class pallindrome {
    public static boolean ispallindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racenar";
        System.out.println(ispallindrome(str));
    }
}
