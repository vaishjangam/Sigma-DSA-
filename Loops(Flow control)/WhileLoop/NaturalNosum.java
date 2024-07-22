import java.util.*;
public class NaturalNosum {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();
        int sum=0;
        int i=1;//i is a counter
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum of the n natural no. is:"+sum);

    }
    
}
