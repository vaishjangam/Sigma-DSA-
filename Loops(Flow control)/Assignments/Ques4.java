/*Write a program to print the multiplication table of a number N, entered by the user */

import java.util.*;
public class Ques4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Enter the number:");
        int number=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(number +"*" +i +"=" +number*i);
        }

    }
    
}
