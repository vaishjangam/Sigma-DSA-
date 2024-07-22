/* WAP to find largest and smallest number in an array */ 
public class LargestArrayNumber {
    public static int getLargest(int numbers[]){        //To get largest number
        int Largest = Integer.MIN_VALUE; // initialization for -infinity
        int Smallest = Integer.MAX_VALUE; // initialization for +infinity
        for(int i=0; i<numbers.length; i++){
            if(Largest<numbers[i]){     //To update largest number 
                Largest=numbers[i];
            }
            if(Smallest >numbers[i]){
                Smallest=numbers[i];
            }
        }
        System.out.println("Smallest number is:"+Smallest);
        return Largest;
        }
    public static void main(String args[]){
        int numbers [] = {1, 2, 5, 6, 3, 7 };
        
        System.out.println("Largest number is:"+getLargest(numbers));
    }
}
