public class SubArrays {
    public static void PrintSubarrays(int[] number) {
        int totalSubarrays = 0;  // To keep track of total subarrays

        // Outer loop for the starting index of the subarray
        for (int i = 0; i < number.length; i++) {
            int start = i;

            // Inner loop for the ending index of the subarray
            for (int j = i; j < number.length; j++) {
                int end = j;

                // Loop to print the subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                totalSubarrays++;
                System.out.println();
            }
            // Empty line to separate subarrays starting from the next element
            System.out.println();
        }
        System.out.println("Total subarrays are: " + totalSubarrays);
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7};
        PrintSubarrays(number);
    }
}
