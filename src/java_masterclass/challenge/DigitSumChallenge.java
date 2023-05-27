package java_masterclass.challenge;

public class DigitSumChallenge {
	public static int sumDigits (int number) {
		Main.printClassName("\nSumDigits");
		
		if (number < 10) {
			return -1;
		}
		
		int	total = 0;
		
		while(number > 0) {
			total += number % 10;
			number /= 10;
		}
		
		return total;
	}
}
