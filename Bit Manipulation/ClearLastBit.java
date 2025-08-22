public class ClearLastBit{

    public static int LastBit(int n, int i){
        int bitMask = ~(0) << i;

        return n & bitMask;
    }
    public static void main (String[] args){
        System.out.print(LastBit(15, 2));
    }
}