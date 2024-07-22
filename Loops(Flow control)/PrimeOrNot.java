/*Check whether number is prime or composite */
import java.util.*;
public class PrimeOrNot {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        
        if(n==2){                                 //we know 2 is prime number
            System.out.println("n is prime!!");
        }else
        {
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false; 
                }
                }
                if(isPrime==true){
                    System.out.println("n is prime");
                }else{
                    System.out.println("n is not prime");
                }
            
            }
        }
       
    
}
