package ee.puik.harjutused;

import java.lang.Math;

public class IsPrime {

	public boolean isPrime(int number) {
		if (number > 2 && number % 2 == 0) {
			return false;
		}

		int upperLimit = (int) Math.sqrt(number);
		int divider = 3;
		while (divider <= upperLimit) {
			if (number % divider == 0) {
				return false;
			} else {
				divider += 2;
			}
		}
		return true;
	}

}
