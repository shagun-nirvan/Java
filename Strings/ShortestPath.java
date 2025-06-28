package Strings;
import java.util.*;
public class ShortestPath {
    public static float getShortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y=y+1;
            }
            else if(dir == 'E'){
                x=x+1;
            }
            else if(dir == 'S'){
                y=y-1;
            }
            else{
                x=x-1;
            }
        } 
        return (float)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
