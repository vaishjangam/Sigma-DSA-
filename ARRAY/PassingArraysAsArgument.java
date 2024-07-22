import java.util.*;

public class PassingArraysAsArgument {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }

    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        Scanner sc=new Scanner(System.in);
        update(marks);

        //to print updated marks
        for(int i=0; i<marks.length; i++){
            System.out.println("The updated marks are:"+marks[i]);
        }
        System.out.println();
    }
    
}
