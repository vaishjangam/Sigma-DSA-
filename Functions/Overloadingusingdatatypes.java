public class Overloadingusingdatatypes {

    //function with datatype int
    public static float Sum(float a, float b){
      return a+b;
    }
    //function with datatype int
    public static int Sum(int a, int b){
        return a+b;
    }

    public static void main(String args[] ){

        System.out.println(Sum(4.0f, 4.0f));
        System.out.println(Sum(4, 4));
        
    }
    
}
