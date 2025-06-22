package Array;

public class linearSearch {
    public static int linearSearch2(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }

        return -1;
    } 
    public static void main(String[] args) {
        int numbers[] = {2,5,7,9,11,21,33,42};
        int key =11;

        int index =  linearSearch2(numbers,key);

        if(index == -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("FOUND AT INDEX :"+ index);
        }
       
    }
}
