package java_masterclass.challenge;

public class For {
	public static double calculateInterest (double amount, double interestRate) {
		return amount * (interestRate/100);
	}
	
	public static void exercise () {
		int i, n;
		
		Main.printClassName("\nFor");
		
		for(i = 2; i <= 8; i++) {
			System.out.println(calculateInterest(10000, i));
		}
		
		for(i = 8; i >= 2; i--) {
			System.out.println(calculateInterest(10000, i));
		}
		
		for(n = 0, i = 500; i <= 2000; i++) {
			if (IsPrime.isPrime(i)) {
				n++;
				System.out.println(i);
				
				if (n == 10) {
					break;
				}
			}
			
		}
	}
}
