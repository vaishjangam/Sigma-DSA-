import java.util.*;
public class CountingSortArray{
    public static void CountingSort(int arr[]){
        int Largest = Integer.MIN_VALUE;    //To find largest number so according
                                            // to that we can know what will be  arr length e.g
                                            // 1, 7,2,1, in this arr length will be 7
        for(int i = 0; i< arr.length; i++){
            Largest = Math.max( Largest, arr[i]);
        }

        int Count[]= new int[Largest+1]; //new Array for count(i.e. frquency) for original count
        for(int i=0; i< arr.length; i++){
            Count[arr[i]]++;
        }

        //For sorting
        int j=0;
        for(int i=0; i < Count.length; i++){
            while(Count[i] > 0){
                arr[j] = i;
                j++;
                Count[i]--;
            }
        }
        

    }
    public static void main(String args[]){
        int arr[] = {5, 7, 1, 2, 1, 4, 3, 3, 6, 4, 5};
        CountingSort(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}