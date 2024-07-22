import java.util.*;
public class Number1toN{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the range:");
        int range=scanner.nextInt();
        int counter=1;
        while(counter<=range){
            System.out.print(counter + " ");
            counter++;
        }

    }
}