public class SpiralMatrix{
    public static void Spiral(int matrix[][]){
        int SR = 0;   //sr-> Starting row
        int SC = 0; //SC -> Starting column
        int ER = matrix.length-1; //ER -> Ending row
        int EC = matrix[0].length-1; //EC ->Ending column

        while(SR<=ER && SC<=EC){

            //top j= column and i=row
            for(int j=SC; j<= EC; j++ ){
                System.out.print(matrix[SR][j] + " ");
            }
            SR++;

            //right 
            for(int i=SR; i<= ER; i++ ){
                System.out.print(matrix[i][EC] + " ");
            }
            EC--;


    //bottom 
    //if condition is added for odd no. of col and row i.e. for n=3, m=3 or n=5, m= 3       
        
                if(SR<=ER){
                    for(int j=EC; j>=SC; j--){ 
                    System.out.print(matrix[ER][j]+ " ");
                }
                ER--;
            }
          

        //left
        //if condition is added for odd no. of col and row i.e. for n=3, m=3 or n=5, m= 3   
            
                if(SC<=EC){
                    for(int i=ER; i>=SR; i--){
                        System.out.print(matrix[i][SC]+" ");
                }
                SC++;
            }               
    }
    System.out.println();

    }
    public static void main(String args[]){
        
        int matrix [][] = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16}
                           };
        Spiral(matrix);
    }
}