package Recursion;

import java.util.ArrayList;
import java.util.List;

public class test {
    
        public static void main(String[] args) {
            System.out.println(letterCombinations("24"));
        }
    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        return pad("",digits);
    }
     private static ArrayList<String> pad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
         int digit = up.charAt(0)-'0';
          ArrayList<String> ans =  new ArrayList<>();
        while(digit<7){
             for (int i = (digit-2)*3; i < (digit-1)*3; i++) {
            char ch = (char)('a' + i);
          ans.addAll(pad(p+ch, up.substring(1)));
           
        }
        if(digit==7){
            for(int i=15; i<19;i++){
                char ch = (char)('a' + i);
                ans.addAll(pad(p+ch, up.substring(1)));
            }
        }
        if(digit==8){
            for(int i=19; i<22;i++){
                char ch = (char)('a' + i);
                ans.addAll(pad(p+ch, up.substring(1)));
            }
        }
        if(digit==9){
            for(int i=22; i<25;i++){
                char ch = (char)('a' + i);
                ans.addAll(pad(p+ch, up.substring(1)));
            }
        }
        }

        return ans;

    }
}

