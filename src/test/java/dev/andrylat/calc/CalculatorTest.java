package dev.andrylat.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void test_sum_when_operands_are_positive() {
        Integer expected = 10;
        Integer actual = calculator.sum(3, 7);

        assertEquals(expected, actual);
    }

    @Test
    void test_sum_when_operands_are_negative() {
        Integer expected = -10;
        Integer actual = calculator.sum(-3, -7);

        assertEquals(expected, actual);
        assertTrue(false);
    }

    @Test
    void test_sum_when_a_is_null_throw_exception() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.sum(null, 10));
    }

}