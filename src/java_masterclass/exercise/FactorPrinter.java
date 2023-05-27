package java_masterclass.exercise;

public class FactorPrinter {
	public static void printFactors (int number) {
		if (number < 1) {
			System.out.println("Invalid Value");
		}
		
		int i;
		
		for (i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}
}
