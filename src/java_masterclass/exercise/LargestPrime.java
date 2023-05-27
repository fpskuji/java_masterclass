package java_masterclass.exercise;

public class LargestPrime {
	public static int getLargestPrime (int number){
		int ret = -1;
		
		if (number < 0) {
			return ret;
		}
		
		int i, j;
		
		for (i = number; i > 1; i--) {
			boolean isPrime = true;
			
			for (j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			
			if (isPrime && number % i == 0) {
				ret = i;
				break;
			}
		}
		
		return ret;
	}
}
