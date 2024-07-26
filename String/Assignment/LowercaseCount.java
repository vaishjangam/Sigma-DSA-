//Question1: Count how many times lowercase vowels occurred in a String entered by the user
import java.util.*;
public class LowercaseCount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String:");
        String str = sc.nextLine();

        int count = 0;

        for(int i= 0 ; i< str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
                count++;
            }
        }
        System.out.println("The count of vowels in string is:" + count);
    }
}
