import java.util.*;
public class incomeTax {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int income=scanner.nextInt();
        int tax;
        
        if(income<500000)
        {
            tax=0*income;
               
        }
        else if(income>=5000000 && income<1000000)
        {
            tax=(int)(income*0.2);
        }
        else{
            tax=(int)(income*0.3);
        }
        System.out.println("your tax is:" + tax);
    }

    
}
