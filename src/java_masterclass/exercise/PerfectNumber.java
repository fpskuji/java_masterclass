package java_masterclass.exercise;

public class PerfectNumber {
	public static boolean isPerfectNumber (int number) {
		if (number < 1) {
			return false;
		}
		
		int i;
		int total = 0;
		
		for (i = 1; i <= number/2; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		
		return (total == number)?true:false;
	}
}
