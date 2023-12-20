import java.util.Scanner;

public class Obsolete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the weight in grams");
        double grams = Integer.parseInt(scanner.nextLine());
        int leiviska = (int)(grams/(13.28 * 32 * 20));
        grams = (grams-(13.28 * 32 * 20*leiviska));
        int nau = (int)(grams/(13.28 * 32));
        grams = grams-(13.28 * 32 * nau);
        double luodit = grams/13.28;


        System.out.printf("Leiviskat: %d Naulat: %d Luodit: %.2f", leiviska,nau,luodit);

    }
}
