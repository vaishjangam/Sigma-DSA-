/*Write a Java program that takes a year from the user and print whether that year is a leap year or not.*/
import java.util.*; 
public class LeapYear {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=scanner.nextInt();
        boolean x=(year%4)==0;
        boolean y=(year%100)!=0;
        boolean z=((year%100)==0 && (year%400)==0);
        if(x && (y||z)){
            System.out.println("This year is a leap");
        }else{
            System.out.println("This is not a leap year!!!");
        }

    }


    
}
