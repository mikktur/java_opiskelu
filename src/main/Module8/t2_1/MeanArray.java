package Module8.t2_1;

import java.util.Arrays;
import java.util.List;

public class MeanArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 10};
        double mean = Arrays.stream(arr).average().getAsDouble();
        System.out.println("Mean of the array: " + mean);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream()
                .filter(number -> number % 2 != 0)
                .mapToInt(e -> e * 2)
                .sum();
        System.out.println("Sum of odd numbers: " + sum);

    }


}
