/*forcefully data conversion from higher to lower datatype e.g conversion of 
float into integer although it causes loss of data i.e explicit conversion
(narrowing conversion)*/
import java.util.*;
public class typecasting {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        float a=4.5f;
        int b=(int)a;
        System.out.println(b);///this code is for the value we don't wanted to round off

        //code for character to integer conversion
        char ch= 'd';
        int number= ch;
        System.out.println(number);

        


    }

    
}
