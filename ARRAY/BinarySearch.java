public class BinarySearch{
    public static int BinarySearchArray(int numbers[], int key){
        int start=0; int end=numbers.length-1; //Initialization of start and end

        while(start<=end){
            int mid= (start+end)/2; //To find the mid
            
            //comparisons
            if(numbers[mid]==key){
               return mid;
            }
            if(numbers[mid]>key){ //left side i.e. 1st half 
                end=mid-1;
            }
            else{    //right side i.e. 2nd half
                start=mid+1;
            }

        }

        return -1;

    }
    public static void main(String args[]){
        int numbers[] = {1, 2, 3, 4, 5, 6, 7};
        int key = 9;

        System.out.println("Index for key is:"+BinarySearchArray(numbers, key));


    }
}