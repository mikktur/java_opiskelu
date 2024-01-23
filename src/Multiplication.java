import java.util.Scanner;
import java.util.Random;
public class Multiplication {
   public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        Random random = new Random();
        while (points != 10){
            for (int i=0;i<10;i++){
                int number1 = random.nextInt(10)+1;
                int number2 = random.nextInt(10)+1;
                int answer = number1*number2;
                System.out.printf("%d * %d = ", number1,number2);
                int input = Integer.parseInt(scanner.nextLine());
                if (input == answer){
                    points++;
                    if(points<10) {
                        System.out.printf("\nCorrect answer! you now have %d points!\n", points);
                    }else break;
                }else {
                    System.out.println("Wrong answer");
                }
            }
        }System.out.print("Congratulations you passed the test!");
    }
}
