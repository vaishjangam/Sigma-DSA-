/*Write a program that reads a set of integers, and then prints the sum of the even and odd integers.*/ 
import java.util.*;
public class Ques2 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num;
        int choice;
        int evenSum=0;
        int oddSum=0;
        
        do{
            System.out.println("Enter the number:");
            num=scanner.nextInt();

            if(num%2==0){
                evenSum+=num;
            }
                else{
                    oddSum+=num; 
                }
                System.out.println("Do you want to continue? Press 1 for Yes or 0 for No!!");
                choice=scanner.nextInt();           
        }while(choice==1);
        System.out.println("Sum of Even number is:"+evenSum);
        System.out.println("Sum of Odd number is:"+oddSum);       
    }
    
}
