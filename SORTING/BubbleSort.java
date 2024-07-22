public class BubbleSort {
    public static void BubbleSorting(int arr[]){
        
        for(int turn =0; turn < arr.length-1; turn++){
            for(int j = 0; j <=arr.length-2; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void Array(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void  main(String args[]){
        int arr[] = {2, 6, 1, 4, 5, 9};
        BubbleSorting(arr);
        Array(arr);
    }
    
}
