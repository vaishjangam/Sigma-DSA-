/* Calculator to +,-,*,/,%*/
import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=scanner.nextInt();
        System.out.println("Enter b:");
        int b=scanner.nextInt();
        System.out.println("Enter operator:");
        char operator=scanner.next().charAt(0);/*it is to print operators, if we want to print only string 
                                                     then we just take char operator=scanner.next()*/
        switch(operator){
            case '+':System.out.println(a+b);
                    break;
            case '-':System.out.println(a-b);
                    break;
            case '*':System.out.println(a*b);
                    break;
            case '/':System.out.println(a/b);
                    break;
            case '%':System.out.println(a%b);
                    break;
            default:System.out.println("Invalid choice");                        
                                    
        }

        }

    }
    

