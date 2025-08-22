
public class LowerToUppercase {
  public static void main(String[] args){
    
    for(char ch = 'a'; ch <= 'z'; ch++){
        System.out.print((char) (ch & '_')); // or can use System.out.print((char) (ch & ~''));
    }
  }  
}
