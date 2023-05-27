package java_masterclass.exercise;

public class SumOddRange {
	public static boolean isOdd (int number) {
		if (number > 0 && number % 2 == 1) {
			return true;
		}
		
		return false;
	}
	
	public static int sumOdd (int start, int end) {
		if (start <= 0 || end <= 0 || start > end) {
			return -1;
		}
		
		int i;
		int total = 0;
		
		for (i = start; i <= end; i++) {
			if (isOdd(i)) {
				total += i;
			}
		}
		
		return total;
	}
}
