package java_masterclass.challenge;

public class DayOfTheWeekChallenge {
	
	static int solution = 0;
	
	static void printDayOfTheWeek (int day) {
		
		Main.printClassName("\nDayOfTheWeekChallenge");
		
		
		if (solution == 0) {
			switch (day) {
				case 0:
					System.out.println("Sunday");
					break;
					
				case 1:
					System.out.println("Monday");
					break;
					
				case 2:
					System.out.println("Tuesday");
					break;
					
				case 3:
					System.out.println("Wednesday");
					break;
					
				case 4:
					System.out.println("Thursday");
					break;
					
				case 5:
					System.out.println("Friday");
					break;
					
				case 6:
					System.out.println("Saturday");
					break;
					
				default:
					System.out.println("Invalid Day");
					break;
			}
		} else if (solution == 1) {
			if (day == 0) {
				System.out.println("Sunday");
			} else if (day == 0) {
				System.out.println("Monday");
			} else if (day == 0) {
				System.out.println("Tuesday");
			} else if (day == 0) {
				System.out.println("Wednesday");
			} else if (day == 0) {
				System.out.println("Thursday");
			} else if (day == 0) {
				System.out.println("Friday");
			} else if (day == 0) {
				System.out.println("Saturday");
			} else {
				System.out.println("Invalid Day");
			}
		}
	}
}
