import java.util.*;
public class MaxArrayElement {
    
public static void main(String args[]){
    int numbers [] = {5, 10, 20, 15};
    Arrays.sort(numbers);
    System.out.print("Sorting in increasing order:");
    

    for(int i=0; i<numbers.length; i++){
        System.out.print(numbers[i]+ " ");
        
        }
    
        int maxNumber = numbers[numbers.length - 1];
        System.out.println("\nMax number is: " + maxNumber);
        
        }
    
    }

