/*Write a program to find the factorial of any number entered by the user */
import java.util.*;
public class Ques3{
    public static void main(String args[]){       
        Scanner scanner=new Scanner(System.in);
        int fact=1;

        System.out.println("Enter the number:");
        int num=scanner.nextInt();

        for(int i=1;i<=num;i++){
             fact*=i;
        }
        System.out.println("Factorial is:"+fact);
    }
}