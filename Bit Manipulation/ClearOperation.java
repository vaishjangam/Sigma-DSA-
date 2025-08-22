public class ClearOperation {

public static int ClearOp(int n, int i){
    int bitMask = ~(1<<i);
    return n & bitMask;
}


    public static void main(String args[]){
        System.out.println(ClearOp(22, 2));
    }
}
