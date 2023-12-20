import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The product of the numbers is " + (first * second * third));
        /* I had to change the print output to float, as averages are typically expressed as
         floating-point numbers. In this case, it was rounded to the closest whole number, resulting in 3 instead of 3.3333333.
         */
        System.out.println("The average of the numbers is " + ((float)(first + second + third) / 3));
    }
}
