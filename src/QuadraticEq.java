import java.util.Scanner;

public class QuadraticEq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the value of a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Give the value of b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Give the value of c: ");
        double c = Double.parseDouble(scanner.nextLine());
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double root;
        double root2;
        if (discriminant < 0) {
            System.out.print("No real roots");

        } else if (discriminant > 0) {
            root = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The roots are : %.2f and %.2f",root,root2);

        } else {
            root = -b / (2 * a);
            System.out.printf("The root is : %.2f",root);

        }
        //b+-sqrt(b^2-4*a*c)/2a//


    }
}
