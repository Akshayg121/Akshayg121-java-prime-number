
public class PrimeNumber {
    
    public boolean isPrime(Integer number) {
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
