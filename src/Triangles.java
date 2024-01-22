import java.util.Scanner;

public class Triangles {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of the first leg of the right triangle: ");
        double jalka1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Input the length of the second leg of the right triangle: ");
        double jalka2 = Double.parseDouble(scanner.nextLine());
        double hypotenuse = Math.hypot(jalka1,jalka2);
        System.out.printf("The length of the hypotenuse is : %.2f", hypotenuse);

    }
}
