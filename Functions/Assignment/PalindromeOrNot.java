/*Question3:Write a Java program to check if a number is a palindrome in Java?
(121 is a palindrome, 321 is not)A number is called a palindrome if the number is equal to the 
reverse of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself. 
On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal
 to 321.*/

 import java.util.*;
public class PalindromeOrNot {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int num=sc.nextInt();
        
        int ori_num=num;
        int rev=0;

        while(num!=0){
            rev=rev*10+(num%10);
            num=num/10;
        }
        if(ori_num==rev){
            System.out.println("Number is a palindrome!!!!!!");
        }else
        {
            System.out.println("Number is not a palindrome!!!!!!");

        }

    }
    
}
