import java.util.*;
public class PalindromeUsingMethod {

   
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the number to check:");
        int palindrome=sc.nextInt();

        if(ispalindrome(palindrome)){
            System.out.println("Number : "+palindrome+" is a palindrome");

        }else
        {
            System.out.println("Number : "+palindrome+" is not a palindrome");
        }

    }
    public static boolean ispalindrome(int number){
        int palindrome=number;
        int rev=0;

        while(palindrome!=0){
            rev=rev*10+(palindrome%10);
            palindrome=palindrome/10;
        }
        if(number==rev){
            return true;
        }
        return false;


    }
    
}
