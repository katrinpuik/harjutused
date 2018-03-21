package ee.puik.harjutused;

public class PrintPrimes {
	
	public void printPrimes (int count, int number) {
		IsPrime primeMachine = new IsPrime();
		while (count < 20) {
			if (primeMachine.isPrime(number)) {
				System.out.println(number);
				count ++;
				number ++;
			} else {
				number ++;
			}			
		}
	}

}
