import java.util.Scanner;

public class Arrays_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many Integers: ");
        int int_amount = scanner.nextInt();
        int[] numbers = new int[int_amount];

        for (int i = 0; i < int_amount; i++) {
            System.out.printf("Enter integer %d: ", i + 1);
            int number = scanner.nextInt();
            numbers[i] = number;
        }

        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;


        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j <= numbers.length - 1; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += numbers[k];
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                        start = i+1;
                        end = j+1;
                    }

                }
            }
        }


        /*

        int max_sum = numbers[0];
        int current_sum = numbers[0];
        int tempStart = 0;


        // using Kadane's algorithm to find maximum subarray sum
        for (int i = 1;i<numbers.length;i++) {
            current_sum = current_sum+numbers[i];

            // Reset the current sum and start index if the current element is larger
            if (numbers[i]>current_sum){
                current_sum = numbers[i];
                tempStart = i;
            }

            // Update the maximum sum, start and end indices if the current sum is larger
            if (max_sum<current_sum){
                max_sum = current_sum;
                start = tempStart+1;
                end = i+1;
            }
            }
        */


        System.out.println("Maximum sum: " + maxSum);
        System.out.print("Integers: " + start + " - " + end);

    }
}
