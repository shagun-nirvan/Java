package Recursion;
public class skipTheChar {
    public static void main(String[] args) {
        String str = "baccad";
        String res = "";
        skipString(str, res);
    }
    static void skipString(String str, String res){
        if(str.length()==0){
            System.out.println(res);
            return;
        }
        char ch = str.charAt(0);
        if(ch=='a'){
            skipString(str.substring(1), res);
        }
        else{
            skipString(str.substring(1), res+ch);
        }
       
    }
}
