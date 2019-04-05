import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char o = '+';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing susecondOperandtraction")
    void testCalculateSusecondOperand() {
        int a = 2;
        int secondOperand = 1;
        char o = '-';
        int expected = 1;

        int result = Calculator.calculate(a, secondOperand, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int a = 2;
        int secondOperand = 2;
        char o = '*';
        int expected = 4;

        int result = Calculator.calculate(a, secondOperand, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int a = 6;
        int secondOperand = 3;
        char o = '/';
        int expected = 2;

        int result = Calculator.calculate(a, secondOperand, o);
        assertEquals(expected, result);
}

    @Test
    @DisplayName("Testing division secondOperandy zero")
    void testCalculateDivsecondOperandyZero() {
        int a = 2;
        int secondOperand = 0;
        char o = '/';
//        int expected = 0;

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(a, secondOperand, o);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int a = 2;
        int secondOperand = 0;
        char o = '=';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(a, secondOperand, o);});
    }
    @Test
    @DisplayName("Test spare secondOperandalance")
    void testCalculateSparesecondOperandalance() {
        int a = 100;
        int secondOperand = 2;
        char o = '%';

        int expected = 0;

        int result = Calculator.calculate(a, secondOperand, o);
        assertEquals(expected, result);
    }
}