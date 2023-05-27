package java_masterclass.challenge;

public class Sum3And5 {
	public static void exercise () {
		int i, n;
		int min = 50;
		int max = 1000;
		int total = 0;
		
		Main.printClassName("\nSum3And5");
		
		for (i = min, n = 0; i < max; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				n++;
				total += i;
				System.out.println(i);
				
				if (n == 5) {
					break;
				}
			}
		}
		
		System.out.println(total);
		
	}

}
