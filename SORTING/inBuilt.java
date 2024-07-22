import java.util.Arrays;
import java.util.Collections;
public class inBuilt {
    public static void main(String args[]){
       Integer arr[] = {2, 4, 5, 55, 0, 1};
                 /*Using Arrays.sort */
        //Arrays.sort(arr);          o/p: 0 1 2 4 5 55 

        //Arrays.sort(arr,  0, 3);   o/p:2 4 5 55 0 1 

                /*Using Collection.reverseOrder() */
       // Arrays.sort(arr, Collections.reverseOrder() );  o/p:55 5 4 2 1 0 
       Arrays.sort(arr, 0, 3, Collections.reverseOrder() );
        for(int i = 0; i < arr.length; i++){
            
                System.out.print(arr[i] + " ");
              
          
        }
       
    }
}
