import java.util.Random;
import java.util.Scanner;

public class Arrays_1 {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Generation amount: ");
        Random rand = new Random();
        int amount = Integer.parseInt(scanner.nextLine());
        String[] firstNames = {"Pekka", "Matti","Mikko","Tiia","Minna","Jerry","Hanna"};
        String[] surNames = {"Turunen", "Jokinen","Nieminen","Aho","Virtanen","Pellinen","Hirvonen"};
        for (int i = 0; i < amount; i++) {
            int rand_int1 = rand.nextInt(firstNames.length-1);
            int rand_int2 = rand.nextInt(surNames.length-1);
            System.out.println(firstNames[rand_int1]+ " " + surNames[rand_int2]);

        }
    }
}
