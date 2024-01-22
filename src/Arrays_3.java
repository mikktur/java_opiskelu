import java.util.Scanner;

public class Arrays_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        System.out.println("Enter the integers into the array: ");
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int[] modNumbers = new int[size];
        int l = 0;
        for (int i = 0;i<size;i++){
            boolean duplicate = false;
            for(int j = 0;j<i;j++){
                if(numbers[i] == modNumbers[j]){
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate){
                modNumbers[l] = numbers[i];
                l++;
            }
        }
        for(int number:modNumbers){
            System.out.println(number);
        }
    }
}
