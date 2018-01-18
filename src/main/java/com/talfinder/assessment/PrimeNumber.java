package com.talfinder.assessment;

public class PrimeNumber {
    
    public boolean isPrime(Integer number) {
        String spotBug = new String("Harsha Bhargav");
        Integer temp = null;
        boolean isPrime = true;
        for(int i=2;i<=number/2;i++) {
            temp=number%i;
	        if(temp==0)
	           {
	               isPrime=false;
	               break;
	           }             
        }
        return isPrime;
    }
}
