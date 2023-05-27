package java_masterclass.exercise;

public class EvenDigitSum {
	public static int getEvenDigitSum (int number) {
		if (number < 0) {
			return -1;
		}
		
		int	total = 0;
		
		while(number > 0) {
			int even;
			
			even = number % 10;
			if (even % 2 == 0) {
				total += even;
			}
			
			number /= 10;
		}
	
		return total;
	}
}
