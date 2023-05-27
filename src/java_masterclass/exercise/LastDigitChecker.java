package java_masterclass.exercise;

public class LastDigitChecker {
	public static boolean hasSameLastDigit (int x, int y, int z) {
		if (!isValid(x) || 
			!isValid(y) || 
			!isValid(z) ) {
			return false;
		}
		
		if (x % 10 != y % 10 && 
			y % 10 != z % 10 && 
			z % 10 != x % 10) {
			return false;
		}
		
		return true;
	}
	
	public static boolean isValid (int x) {
		if (x < 10 || x > 1000) {
				return false;
			}
		return true;
	}
}
