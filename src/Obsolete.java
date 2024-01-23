import java.util.Scanner;

public class Obsolete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight (g): ");
        double grams = Integer.parseInt(scanner.nextLine());
        int leiviska = (int)(grams/(13.28 * 32 * 20));
        double grams_mod = (grams-(13.28 * 32 * 20*leiviska));
        int nau = (int)(grams_mod/(13.28 * 32));
        grams_mod = grams_mod-(13.28 * 32 * nau);
        double luodit = grams_mod/13.28;


        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti", grams,leiviska,nau,luodit);

    }
}
