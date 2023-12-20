import java.util.Scanner;

public class FahToCel {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input degrees in fahrenheit");
        double fah = Double.parseDouble(scanner.nextLine());
        double cel = (fah-32)*5/9;
        System.out.printf("%.1f Fahrenheit in Celsius is: %.1f%n", fah, cel);
    }
}
