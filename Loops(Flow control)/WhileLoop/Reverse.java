public class Reverse {
    public static void main(String args[]){
        int number=3278;

        while(number>0){
           int lastdigit=number%10;
           System.out.print(lastdigit);
            number=number/10;
          

        }
        System.out.println();

    }
}
