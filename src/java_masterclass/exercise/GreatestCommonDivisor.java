package java_masterclass.exercise;

public class GreatestCommonDivisor {
	public static int getGreatestCommonDivisor (int first, int second) {
		if (first < 10 || second < 10) {
			return -1;
		}
		
		int i, j;
		
		for (i = 1; i <= first; i++) {
			if (first % i == 0) {
				int fist_quotient = first/i;
				for (j = 1; j <= second; j++) {
					
					// Skip numbers that are not a factor of second number
					// For efficiency purposes
					if (second % j != 0) {
						continue;
					}
					
					if (fist_quotient == second/j) {
						return fist_quotient;
					// Skip the loop when second number is less 
					// than current first number
					} else if (fist_quotient > second/j) {
						break;
					}
				}
			}	
		}
		
		return -1;
	}
}
