public class ReverseGiven {
    public static void main(String args[]){
        int num=10899;
        int rev=0;
        while(num>0){
            int lastdigit=num%10;
            num=num/10;
            rev=(rev*10)+lastdigit;
            
            
        }
        System.out.print(rev);
    }
    
}
