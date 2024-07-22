/*Question2:Write a method named isEven that accepts an int argument. The method should
return true if the argument iseven, or false otherwise.Also write a program to test  
method. */
import java.util.*;
public class Solution {

    public static Boolean isEven (int i) {

        return (i % 2) == 0;

    }

    public static void main(String[] args) {
        if (isEven(15)) { 
            System.out.print("Yes!");
        }else{
            System.out.println("IT'S ODD NUMBER!!!!!!!");
        }


    }

}
