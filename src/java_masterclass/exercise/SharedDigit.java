package java_masterclass.exercise;

public class SharedDigit {
	public static boolean hasSharedDigit (int x, int y) {
		if (x < 10 || x > 99 || y < 10 || y > 99) {
			return false;
		}
		
		while(x > 0) {
			int temp = y;
			while(temp > 0) {
				int num1 = x % 10;
				int num2 = temp % 10;
				
				if (num1 == num2) {
					return true;
				}
				temp /= 10;
			}
			x /= 10;
		}
		
		return false;
	}
}
