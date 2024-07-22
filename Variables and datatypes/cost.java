import java.util.*;
public class cost {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        float pencilprice=scanner.nextFloat();
        float penprice=scanner.nextFloat();
        float eraserprice=scanner.nextFloat();
        float totalcost= pencilprice+penprice+eraserprice;
        System.out.println("The total cost is:"+totalcost);

        float GST = totalcost +(0.18f * totalcost);

        System.out.println("The bill with 18% GST:"+GST);

    }
    
}
