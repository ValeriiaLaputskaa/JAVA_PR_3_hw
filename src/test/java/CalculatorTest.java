import org.example.Calculator;
import org.example.InvalidInputException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testDivisionByZero() {
        ArithmeticException exception = null;

        try {
            for (int i = 0; i < 1; i++) {
                calculator.div(10, 0);
            }
        } catch (ArithmeticException e) {
            exception = e;
        }
        assertNotNull(exception, "Очікуване ArithmeticException не було викинуто");
        assertEquals("Ділення на нуль не допускається.", exception.getMessage());
    }


    @Test
    void testSquareRootOfNegativeNumber() {
        InvalidInputException exception = null;

        try {
            calculator.squareRoot(-10);
        } catch (InvalidInputException e) {
            exception = e;
        }

        assertNotNull(exception, "Очікуване InvalidInputException не було викинуто");
        assertEquals("Не можна обчислити квадратний корінь з від'ємного числа.", exception.getMessage());
    }


    @Test
    void testInvalidInputForSquareRoot() {
        NumberFormatException exception = null;

        try {
            Double.parseDouble("invalidNumber");
        } catch (NumberFormatException e) {
            exception = e;
        }

        assertNotNull(exception, "Очікуване NumberFormatException не було викинуто");
        assertEquals("For input string: \"invalidNumber\"", exception.getMessage());
    }

    /*  @Test
    void testAddition() {
        double result = calculator.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    void testSubtraction() {
        double result = calculator.sub(10, 5);
        assertEquals(5, result);
    }

    @Test
    void testMultiplication() {
        double result = calculator.mul(10, 5);
        assertEquals(50, result);
    }

    @Test
    void testDivision() {
        double result = calculator.div(10, 2);
        assertEquals(5, result);
    }
*/
    @Test
    void testSquareRoot() throws InvalidInputException {
        double result = calculator.squareRoot(16);
        assertEquals(4, result);
    }
}
