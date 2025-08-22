public class isPowerofTwo {
    public static boolean IsPowerofTwo(int n){
        
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args){
        System.out.print(IsPowerofTwo(9));
    }
}
