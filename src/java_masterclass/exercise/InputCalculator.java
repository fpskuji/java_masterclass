package java_masterclass.exercise;

import java.util.Scanner;

public class InputCalculator {
	public static void inputThenPrintSumAndAverage () {
		Scanner scn = new Scanner(System.in);
		int total = 0;
		long count = 0;
		
		while (true) {
			if (!scn.hasNextInt()) {
				break;
			}
			
			total += scn.nextInt();
			count++;
			
			scn.nextLine();
		}

		if (count == 0) {
			count = 1;
		}
		System.out.println("SUM = " + total + " AVG = " + Math.round((double)total/count));
		
		scn.close();
	}
}
