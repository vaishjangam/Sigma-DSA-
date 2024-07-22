/* to make pattern:
12345
1234
123
12
1
*/
public class invertedhalfpyramidenumber{
    public static void main(String args[]){
      int n=4;
      for(int line=5; line<=n; line--){
        for(int num=1; num<=line; num--){
            System.out.print(n);
        }
        System.out.println();
      }
    }
    
}