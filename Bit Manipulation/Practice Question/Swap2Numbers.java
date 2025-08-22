
public class Swap2Numbers {
   
    public static void main(String[] args){

        int x =5; 
        int y = 8;
        System.out.println("Numbers before Swapping:" + " x = "+ x + " y = " + y);
         x = x ^ y;
        y = x^ y;
        x = x ^ y;
        
        System.out.println("Swappet numbers are:" + " x = "+ x + " y = " + y);
    }
}
