package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MathUtilsTest {
    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    // ----------------------
    // Tests for factorial()
    // ----------------------

    @Test
    void testFactorialOfZeroShouldReturnOne() {
        assertEquals(1, mathUtils.factorial(0),
                "factorial(0) should return 1");
    }

    @Test
    void testFactorialOfOneShouldReturnOne() {
        assertEquals(1, mathUtils.factorial(1),
                "factorial(1) should return 1");
    }

    @Test
    void testFactorialOfPositiveNumberShouldReturnCorrectResult() {
        // Example: 5! = 120
        assertEquals(120, mathUtils.factorial(5),
                "factorial(5) should return 120");
    }

    @Test
    void testFactorialOfNegativeNumberShouldThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> mathUtils.factorial(-1),
                "factorial(-1) should throw IllegalArgumentException");
    }

}

