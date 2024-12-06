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



    // ----------------------
    // Tests for isPrime()
    // ----------------------

    @Test
    void testIsPrimeWithPrimeNumberShouldReturnTrue() {
        assertTrue(mathUtils.isPrime(7),
                "isPrime(7) should return true");
    }

    @Test
    void testIsPrimeWithNonPrimeNumberShouldReturnFalse() {
        assertFalse(mathUtils.isPrime(10),
                "isPrime(10) should return false");
    }

    @Test
    void testIsPrimeWithEdgeCasesShouldReturnFalse() {
        // 0 and 1 are not prime by definition
        assertFalse(mathUtils.isPrime(0),
                "isPrime(0) should return false");
        assertFalse(mathUtils.isPrime(1),
                "isPrime(1) should return false");
    }


    // ----------------------
    // Tests for gcd()
    // ----------------------

    @Test
    void testGcdOfTwoPositiveNumbersShouldReturnCorrectResult() {
        // GCD of 54 and 24 is 6
        assertEquals(6, mathUtils.gcd(54, 24),
                "gcd(54,24) should return 6");
    }

    @Test
    void testGcdWhenOneNumberIsZeroShouldReturnAbsoluteValueOfOther() {
        // gcd(0, 5) = 5 and gcd(-7, 0) = 7
        assertEquals(5, mathUtils.gcd(0, 5),
                "gcd(0,5) should return 5");
        assertEquals(7, mathUtils.gcd(-7, 0),
                "gcd(-7,0) should return 7");
    }

    @Test
    void testGcdWhenBothNumbersAreZeroShouldThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> mathUtils.gcd(0, 0),
                "gcd(0,0) should throw IllegalArgumentException");
    }

    // Optional additional test: gcd with negative numbers ensures values are taken as absolute
    @Test
    void testGcdWithNegativeNumbersShouldReturnCorrectResult() {
        // gcd(-12, -8) = 4
        assertEquals(4, mathUtils.gcd(-12, -8),
                "gcd(-12,-8) should return 4");
    }
}

