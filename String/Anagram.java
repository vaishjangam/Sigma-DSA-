//Question 4 :Determine if 2 Strings areanagramsof each other.What are anagrams?
// If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider 
// race and care. In this case, race's characters can be formed in to a study, or care's characters can be 
// formed into race.Below is a java program to check if two strings are anagrams or not.

import java.util.Arrays;

public class Anagram {
    public static void main(String args[]){
        String str1 = "heart";
        String str2 ="earth";

        //convert to lowercase so that we don't have to check separately for lower & uppercase
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //check if length is equal or not of both strings
        if(str1.length() == str2.length()){

            //convert string into character array
            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();

            //sort character array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // if the sorted char arrays are same or identical then the strings are anagram

            boolean result =  Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1+" and "+str2+" are anagrams of each other.");
            }else{
                System.out.println(str1+" and "+str2+" are not anagrams of each other.");
            }
        }
    }
}
      
    

