package java_masterclass.challenge;

import java.util.Scanner;

public class ReadingUserInputChallenge {
	public static void ReadUserInput () {
		Scanner scn = new Scanner(System.in);
		int count = 0;
		int total = 0;
		
		while (count < 10) {
			System.out.println("Enter number #" + ++count + ":");
			if (scn.hasNextInt()) {
				total += scn.nextInt();
			} else {
				System.out.println("Invalid number");
			}
			scn.nextLine();
		}
		
		System.out.println("Total = " + total);
		scn.close();
	}
}
