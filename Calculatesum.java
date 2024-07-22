import java.util.*;
public class Calculatesum {

    public static int Addition (int a, int b){//parameters or formal parameteres
        int sum=a+b;
        return sum;
    
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Value of a is:");
        int num1 = sc.nextInt();
        System.out.println("Value of b is:");
        int num2=sc.nextInt();
        int sum=Addition(num1, num2);//actual parameters or arguments
        System.out.println("The sum is:"+sum);
        
    }
}
