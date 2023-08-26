package test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest extends BaseTest {

    @Test
    public void testSum() throws InterruptedException {
        int result = calculator.sum(2, 2);
        if (result != 4) {   // if 2 + 2 != 4
            Assertions.fail();
        }
    }

    @Test
    public void testMinus() {
        Assertions.assertEquals(0, calculator.substruction(2, 2));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(2, calculator.division(6, 3));
    }

    @Test()
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        assertThrows(ArithmeticException.class, () -> calculator.division(6, 0), "ArithmeticException error was expected");
    }
}