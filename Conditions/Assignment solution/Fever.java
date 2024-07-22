/*Finishthefollowingcodesothatitprints
You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
public class Solution{
    public static void main(String[]args) {
        doubletemp=103.5;
    }
} */
import java.util.*;
public class Fever {
public static void main(String args[]){
     double temp=103.5;
     if(temp>100){
        System.out.println("You have a fever");
     }else{
        System.out.println("You don't have a fever");
     }
}      
}
