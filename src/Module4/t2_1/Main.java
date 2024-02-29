package Module4.t2_1;
/*In addition, write a temporary main method that creates an instance of the Calculator class and
 uses it to calculate the sum of a few integers.*/
public class Main {


    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // Create an instance of the Calculator class
        calculator.add(5); // Add 5 to the calculator
        calculator.add(10);  // Add 10 to the calculator
        calculator.add(15); // Add 15 to the calculator
        System.out.println("The sum of the numbers is: " + calculator.getValue()); // Print the sum of the numbers
    }

}
