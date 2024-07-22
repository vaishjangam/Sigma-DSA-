
/* Question 1 :Write a Java method to compute the averageof three numbers.*/
import java.util.*;

public class Averageof3num {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        double num1=sc.nextDouble();
        System.out.println("Enter the 2nd number:");
        double num2=sc.nextDouble();
        System.out.println("Enter the 3rd number:");
        double num3=sc.nextDouble();
        System.out.println("The average of 3 number is: " + avg(num1, num2, num3));
    }
    public static double avg(double num1, double num2, double num3){
        return (num1+num2+num3)/3;

    }

    
}
