/* Make a pattern:*****
                  ****
                  ***
                  **
                  *
*/


import java.util.*;
public class Startpatternreverse {
    public static void main(String arg[]){
      int n=5;
      for(int line=1; line<=n; line++){
        for(int star=1; star<=n-line+1; star++){
            System.out.print("*");
        }
        System.out.println("");
      }
    }  
}
