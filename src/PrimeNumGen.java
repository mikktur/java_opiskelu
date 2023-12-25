import java.util.Scanner;

public class PrimeNumGen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input the starting point");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.print("input the ending point");
        int end = Integer.parseInt(scanner.nextLine());
        boolean isPrime;

        for (int i = start; i <= end; i++) {
            isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int n = 2; n <= Math.sqrt(i); n++) {
                    if (i % n == 0) {
                        isPrime = false;
                        break;
                    }
                }


            }
            if (isPrime) {
                System.out.printf("%d is a prime number\n", i);
            }

        }
    }
}
