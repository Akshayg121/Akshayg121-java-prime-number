package com.talfinder.assessment;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumber2Test {
    
    @Test
    public void testIsPrimeNumber2() {
        PrimeNumber prime = new PrimeNumber();
        assertTrue(prime.isPrime(19));
    }
    
    @Test
    public void testIsPrimeNumberNegative2() {
        PrimeNumber prime = new PrimeNumber();
        assertFalse(prime.isPrime(10));
    }
}
