package java_masterclass.challenge;

public class IsPrime {
	public static boolean isPrime (int n) {
		int i;
		
		for (i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
