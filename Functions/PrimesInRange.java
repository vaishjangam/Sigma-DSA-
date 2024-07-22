
public class PrimesInRange{

    public static boolean isPrime(int n){
        
        if(n==2){
            System.out.println("It is a prime number!!");
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
    /*public static void PrimeRange(int n){
        for(int i=2; i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        
    }*/
    public static void main(String args[]){
       System.out.println(isPrime(8));


    }
}