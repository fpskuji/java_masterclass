package java_masterclass.exercise;

public class MinutesToYearsDaysCalculator {
	public static void printYearsAndDays (long minutes) {
		if(minutes < 0) {
			System.out.println("Invalid Value");
		}else {
			System.out.println(minutes + " min = " + minutes/525_600 + " y and " + (minutes%525_600)/1_440 + " d");
		}
	}
}
