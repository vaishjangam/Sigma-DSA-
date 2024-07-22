/*Enter all numbers entered by users except multiple of 10 */
import java.util.*;
public class Multipleof10 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter your number:");
            int n=scanner.nextInt();
           if(n%10==0) {
            continue;
           }
           System.out.println(" your number was:"+n);

        }while(true);
  
    }
    
}
