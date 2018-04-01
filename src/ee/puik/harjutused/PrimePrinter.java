package ee.puik.harjutused;

public class PrimePrinter {

    public void printPrimes(int numberOfPrimesToPrint, int startFromNumber) {
	int number = startFromNumber;
	PrimeDefinator primeMachine = new PrimeDefinator();
	int counter = 0;
	while (counter < numberOfPrimesToPrint) {
	    if (primeMachine.isPrime(number)) {
		System.out.println(number);
		counter++;
		number++;
	    } else {
		number++;
	    }
	}
    }

}
