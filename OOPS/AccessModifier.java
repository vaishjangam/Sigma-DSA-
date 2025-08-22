public class AccessModifier {
    public static void main(String args[]){
        BankAcc b1 = new BankAcc();
        b1.Username=("Vaishnavi");
        System.out.println(b1.Username);

       b1.setPass(12453);
        
        
        
    }
}

class BankAcc{
    public String Username;
    private int PWD;
    public void setPass(int newPWD){
        PWD = newPWD;
    }   
}
