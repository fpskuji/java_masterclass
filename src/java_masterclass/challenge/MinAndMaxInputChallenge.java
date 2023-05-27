package java_masterclass.challenge;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
	public static void MinAndMaxInput () {
		Scanner scn = new Scanner(System.in);
		int min = Integer.MAX_VALUE; //set to high for initial value only
		int max = Integer.MIN_VALUE; //set to low for initial value only
		int tmp;
		
		while (true) {
			System.out.println("Enter number");
			if (!scn.hasNextInt()) {
				break;
			}
			
			tmp = scn.nextInt();
			if (tmp > max) {
				max = tmp;
			}
			
			if (tmp < min) {
				min = tmp;
			}
			scn.nextLine();
		}
		System.out.println("Max value: " + max + "\n" + "Min value: " + min);
		
		scn.close();
	}
}
