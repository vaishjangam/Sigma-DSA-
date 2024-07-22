import java.util.*;

public class ArrayBasic {
    public static void main(String args[]){
        //Creating an Array
        
        int marks[]= new int[50];//Crating an empty array with size 50
       /* int number[]= {1, 2, 3};
        String name[]={"Vaish", "Shreyash", "Asmita", "Akshada"};
        */ 
        Scanner sc= new Scanner(System.in);
        
        marks[0]=sc.nextInt();//phy 
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//maths

        System.out.println("phy:"+marks[0]);
        System.out.println("chem:"+marks[1]);
        System.out.println("maths:"+marks[2]);

        //updating an array

        marks[0]=100;
        System.out.println("Udated phy marks:"+marks[0]);

        //Calculating an marks
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage are:"+percentage);

        //Calculating the length of an array
        System.out.println("Length of an array is:"+marks.length);

    }
}
