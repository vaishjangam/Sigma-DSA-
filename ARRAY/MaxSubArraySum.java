//Brute Force 
public class MaxSubArraySum {
    public static void MaxSumArray(int numbers[]){
        int currSum = 0;  //To store current sum of subarray
        int maxSum = Integer.MIN_VALUE;  //- infinity

        for(int i=0; i<numbers.length; i++){         //To find starting of Subarray
            int start = i;
            for(int j=i; j<numbers.length; j++){     //To find ending of subarray
                int end = j;
                currSum = 0;                         // To initialize currSum because value
                                                    // always change

                for(int k= start; k<= end; k++){    // To print sum of the subarray
                    currSum += numbers[k];
                }
                System.out.println(currSum);  //To print sum of current Subarray

                if(currSum > maxSum){       //To check and update current value to maxSum
                    maxSum = currSum;
                }                
            }
        }
        System.out.print("The Maximum sum of the subarray is:"+maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {1, -3, 2};
        MaxSumArray(numbers);
    }  
}
