package com.talfinder.assessment;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    
    @Test
    public void testIsPrimeNumber() {
        PrimeNumber prime = new PrimeNumber();
        assertTrue(prime.isPrime(19));
    }
    
    @Test
    public void testIsPrimeNumberNegative() {
        PrimeNumber prime = new PrimeNumber();
        assertFalse(prime.isPrime(10));
    }
}
