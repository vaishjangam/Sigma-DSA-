public class UpdateOperation {
    public static int setOp(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int ClearOp(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
public static int UpdateOp(int n, int i, int newBit ){
    ////this method is for simple understanding////
    // if(newBit == 0){
    //     return ClearOp(n, i);
    // }else{
    //     return setOp(n, i);
    // }

    n = ClearOp(n, i);
    int BitMask = newBit<<i;
    return n|BitMask;


}
  public static void main(String args[]){
    System.out.println(UpdateOp(10, 2, 1));
  }  
}
