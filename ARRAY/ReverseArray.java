public class ReverseArray {
    public static void Reverse(int number[]){
        int First=0;
        int Last = number.length-1;
        while(First < Last){ 
        int temp = number[Last];
        number[Last] =number[First];
        number[First]= temp;

        First++;
        Last--;
        }
    }
   public static void main(String args[]){
    int number[] ={1, 2, 3, 4, 5, 6, 7};
    Reverse(number);
    
    for(int i=0; i<number.length; i++){
        System.out.print(number[i]+ " ");
    }
  
    System.out.println();


   } 
}
