# Calculator
This is a simple calculator that can perform subtraction.

## code:
```public class Calculator {
public class Calculator {
    
    private int value; // A private integer field that stores the current value of the calculator.

    public void reset() { // A method that resets the calculator to zero.
        value = 0;
    }

    public void add(int number) { // A method that adds an integer to the calculator.
        value += number;
    }

    public int getValue() { // A method that returns the current value of the calculator.
        return value;
    }
}

public class Main {
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // Create an instance of the Calculator class
        calculator.add(5); // Add 5 to the calculator
        calculator.add(10);  // Add 10 to the calculator
        calculator.add(15); // Add 15 to the calculator
        System.out.println("The sum of the numbers is: " + calculator.getValue()); // Print the sum of the numbers
    }

}
```

## Explanation:
The Calculator class has a private integer field that stores the current value of the calculator.
It has a method that resets the calculator to zero, a method that adds an integer to the calculator,
and a method that returns the current value of the calculator. The Main class creates an instance
of the Calculator class and adds three numbers to the calculator. It then prints the sum of the numbers.