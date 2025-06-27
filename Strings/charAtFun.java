package Strings;

public class charAtFun {
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "adhfbh%$@^%hgh^%vH78tH67GH";
        printletters(str);
    }
}
