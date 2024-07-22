/*
 * Make a pattern: A
                   BC
                   DEF
                   GHIJ
                   KLMNO
 */
public class characterpattern {
    public static void main(String arg[]){
        int n=5;
        char ch='A';
        for(int line=1; line<=n; line++){
            for(int chars=1; chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
