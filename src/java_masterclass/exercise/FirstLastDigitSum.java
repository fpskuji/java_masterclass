package java_masterclass.exercise;

public class FirstLastDigitSum {
	public static int sumFirstAndLastDigit (int number) {
		int	first = 0;
		int last = number % 10;
		
		if (number < 0) {
			return -1;
		}
		
		while(number > 0) {
			first = number % 10;
			number /= 10;
		}
		
		return first + last;
	}
}
