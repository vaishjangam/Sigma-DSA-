public class SelectionSort {
    public static void Selection(int arr[]){
        for(int i = 0; i <= arr.length-2; i++){
            int minPos = i; //current position
            for(int j = i+1; j < arr.length; j++ ){
                if( arr[minPos] > arr[j]){
                    minPos = j; 
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]= temp;
           
        }
    }

    public static void main(String args[]){
       int arr[] = {5, 4, 1, 3, 2};
      Selection(arr);
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }

    }
    
}
