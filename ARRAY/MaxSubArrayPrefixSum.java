public class MaxSubArrayPrefixSum {
    public static void MaxPrefixSum(int numbers[]){
        int currSum = 0;  //To store current sum of subarray
        int maxSum = Integer.MIN_VALUE;  //- infinity
        int Prefix[] = new int[numbers.length];

        //calculate prefix array:
        Prefix[0] = numbers[0]; //till  0th index there no sum so we started from 1
        for(int i=1; i<Prefix.length; i++ ){
            Prefix[i]=Prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){         //To find starting of Subarray
            int start = i;
            for(int j=i; j<numbers.length; j++){     //To find ending of subarray
                int end = j;
                currSum = start==0 ? Prefix[end] : Prefix[end] - Prefix[start-1];
                             //start==0 ? Prefix[end]  is used to check if start value is zero
                             //if it is 0 then it willl return Prefix[end]                     

        

                if(currSum > maxSum){       //To check and update current value to maxSum
                    maxSum = currSum;
                }                
            }
        }
        System.out.print("The Maximum sum of the subarray is:"+maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {1, -3, 2};
        MaxPrefixSum(numbers);
    }  

}
