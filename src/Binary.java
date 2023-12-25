import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a binary number");
        String binaryStr = scanner.nextLine();

        int decimal = 0;
        for (int i = 0; i < binaryStr.length(); i++) {

            int binary = binaryStr.charAt(i) - '0';
            if (binary == 1) {
                decimal = (int) (decimal + binary * Math.pow(2, binaryStr.length() - 1 - i));
            }
        }
        System.out.print(decimal);
    }
}
