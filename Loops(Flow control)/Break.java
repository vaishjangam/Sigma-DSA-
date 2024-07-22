
/*Keep entering numbers till user enters a multiple of 10 */
import java.util.*;
public class Break {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter your number:");
            int num=scanner.nextInt();
            if(num%10==0){
                System.out.println("I am out of loop!! ");
                break;
                 
            }
             System.out.print(num);
             
           

        }while(true);

    }

    
}
