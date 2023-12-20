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
        /* I had to change the print output to double, as averages are typically expressed as
         floating-point numbers. Integers lose the remainders so the number would have been 3 instead of 4.333333333333333.
         And float was not accurate enough, so it needed to be a double.
          Also, i limited decimals, so it should be exactly the same number now.
         */
        System.out.printf("The average of the numbers is %.13f%n", ((double)(first + second + third) / 3));
    }
}
