package Module4.t2_1;


/*The class acts as the model in the MVC pattern. It should have the following methods:

    A method that resets the calculator to zero.
    A method that adds an integer to the calculator.
    A method that returns the current value of the calculator.
*/
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
