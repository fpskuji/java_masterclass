package java_masterclass.exercise;

public class NumberPalindrome {
	public static boolean isPalindrome (int number) {
		if (number < 0) {
			number *= -1;
		}
		
		int original = number;
		int palindrome = 0;
		
		while(number > 0) {
			palindrome += number % 10;
			if (number > 9) {
				palindrome *= 10;
			}
			number /= 10;
		}
		
		return (palindrome == original)?true:false;
	}
}
