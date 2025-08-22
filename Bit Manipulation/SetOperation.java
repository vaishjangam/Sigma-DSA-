public class SetOperation {
    public static int setOp(int n,int i){
        int bitMask = 1<<i;

        return n | bitMask;

       
    }
    public static void main(String args[]){
        System.out.println(setOp(10, 2));
    }
}
