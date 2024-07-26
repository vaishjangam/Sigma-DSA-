import java.util.*;

public class BinToDec {
    public static int BinaryNumber(int binNum){
        int dec=0;
        int power=0;
        
        while(binNum>0){
            int lastDigit = binNum%10;
            dec+=(lastDigit*(int)Math.pow(2, power));
            power++;
            binNum/=10;


        }

        return dec;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary number:");
        int BinNum=sc.nextInt();
        int dec= BinaryNumber(BinNum);
        System.out.println("Binary Equivalent is:"+dec);     
    
       
    }
    
}
