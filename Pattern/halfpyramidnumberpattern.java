/*Make a pattern: 1
                  12
                  123
                  1234
                  12345
 */


public class halfpyramidnumberpattern {
    public static void main(String args[]){
        int n=5;
        for(int line=1; line<=n; line++){ //for outer loop  as we know n number of  lines we have to print.
            for(int number=1; number<=line; number++){ //to print a number wrt line.
                System.out.print(number);
            }
            System.out.println();//to make new line .
        }
    }
}
