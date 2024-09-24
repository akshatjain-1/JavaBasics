import java.util.*;

public class Arrays {


    //update array
    public static void update(int marks[]){
        for(int i=0; i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }

    //liner search
    public static int LinearSearch(int numbers[], int key) {

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                
                return i ;
            }    
        }
        return -1;
        
    }

    //largest in an array
    public static int getLargest(int numbers[] ) {
        int largest= Integer.MIN_VALUE; 
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest= numbers[i];
            }
            if(smallest> numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest number is :" + smallest);
        return largest;
    }


    //binary search
    



    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 30, 5, 7 ,9 , 10, 11, 14, 17, 18, 2859942, 27};
        System.out.println("Largest number is :" + getLargest(numbers));
       

    }
    
    


}
