package java_masterclass.challenge;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Java masterclass topics:");
		HelloWorld.challenge();
		PrimitiveTypes.challenge();
		Operators.challenge();
		Methods.challenge();
		SwitchCase.challenge();
		DayOfTheWeekChallenge.printDayOfTheWeek(5);
		For.exercise();
		Sum3And5.exercise();
		System.out.println(DigitSumChallenge.sumDigits(186786786));
		System.out.println(IsPrime.isPrime(7));
//		ReadingUserInputChallenge.ReadUserInput(); //Commented out due to user input
//		MinAndMaxInputChallenge.MinAndMaxInput(); //Commented out due to user input
	}
	
	public static void printClassName(String classname) {
		System.out.println(classname);
	}
}
