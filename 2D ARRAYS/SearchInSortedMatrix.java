public class SearchInSortedMatrix {
    public static boolean SearchMatrix1(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        while(row < matrix.length && col >= 0 ){
            if( matrix[row][col] == key){             
                System.out.println("Key is fount at ("+row+ "," +col+")");
                return true;   
            }
            else if(key < matrix[row][col]){
                col--; // left
            }
            else{
                row++; //bottom
            }
        }
        System.out.println("Key not found");
        return false;
    }

    ////////////////////////////////
    public static boolean SearchMatrix2(int matrix[][], int key){
        int row =matrix[0].length-1, col = 0;
        while(row >= 0 && col < matrix.length){
            if( matrix[row][col] == key){             
                System.out.println("Key is fount at ("+row+ "," +col+")");
                return true;   
            }
            else if(key < matrix[row][col]){
                row--; // top
            }
            else{
                col++; //right
            }
        }
        System.out.println("Key not found");
        return false;
    }
 
    public static void main(String args[]){
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        
        SearchMatrix1(matrix, 33);
        SearchMatrix2(matrix, 30);
    }
}
