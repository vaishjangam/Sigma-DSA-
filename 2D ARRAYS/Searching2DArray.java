import java.util.*;
public class Searching2DArray {

public static boolean SearchElement(int matrix[][], int key){
    
    for(int i= 0; i < matrix.length; i++){              //rows
        for(int j= 0 ; j < matrix[0].length; j++){      //column
            if(matrix[i][j] == key){
                
                System.out.println("Key ound at cell (" + i + "," +j+")");
                return true;
            }
        }
    }
    System.out.println("key not found");
    return false;

}
    public static void main(String args[]){
        int matrix[][] = new int[3][3];

        int n = matrix.length;
        int m = matrix[0].length; 
        Scanner sc = new Scanner(System.in);

        for(int i= 0; i < n; i++){
            for(int j= 0 ; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // output

        for(int i= 0; i < n; i++){
            for(int j= 0 ; j < m; j++){
               System.out.print( matrix[i][j] + " ");
            }
            System.out.println();
        }
            SearchElement(matrix, 7);
        }
    }

