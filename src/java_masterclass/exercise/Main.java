package java_masterclass.exercise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeedConverter.printConversion(170);
		MegaBytesConverter.printMegaBytesAndKiloBytes(8192);
		System.out.println(BarkingDog.shouldWakeUp(true, 0));
		System.out.println(LeapYear.isLeapYear(1804));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(1.123365656, 1.123));
		System.out.println(TeenNumberChecker.hasTeen(13, 21, 22));
		System.out.println(AreaCalculator.area(50));
		System.out.println(AreaCalculator.area(50, 100));
		MinutesToYearsDaysCalculator.printYearsAndDays(99999999);
		IntEqualityPrinter.printEqual(1, 1, 1);
		IntEqualityPrinter.printEqual(1, 1, 2);
		IntEqualityPrinter.printEqual(-1, -1, -1);
		IntEqualityPrinter.printEqual(1, 2, 3);
		System.out.println(PlayingCat.isCatPlaying(true, 10));
		System.out.println(PlayingCat.isCatPlaying(false, 36));
		System.out.println(PlayingCat.isCatPlaying(false, 35));
		NumberInWord.printNumberInWord(10);
		System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020) + " days");
		System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018) + " days");
		System.out.println(SumOddRange.sumOdd(1, 100));
		System.out.println(SumOddRange.sumOdd(-1, 100));
		System.out.println(SumOddRange.sumOdd(100, 100));
		System.out.println(SumOddRange.sumOdd(13, 13));
		System.out.println(SumOddRange.sumOdd(100, -100));
		System.out.println(SumOddRange.sumOdd(100, 1000));
		System.out.println(NumberPalindrome.isPalindrome(1111));
		System.out.println(NumberPalindrome.isPalindrome(1111111));
		System.out.println(NumberPalindrome.isPalindrome(1212112121));
		System.out.println(NumberPalindrome.isPalindrome(121212121));
		System.out.println(NumberPalindrome.isPalindrome(-1221));
		System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(10));
		System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(11));
		System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(1135));
		System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
		System.out.println(SharedDigit.hasSharedDigit(25, 12));
		System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));
		System.out.println(LastDigitChecker.hasSameLastDigit(91, 91, 999));
		System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
		System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
		FactorPrinter.printFactors(6);
		System.out.println(PerfectNumber.isPerfectNumber(25));
		NumberToWords.numberToWords(12345);
		NumberToWords.numberToWords(100);
		System.out.println(FlourPacker.canPack(1, 0, 4));
		System.out.println(FlourPacker.canPack(2, 5, 11));
		System.out.println(LargestPrime.getLargestPrime(21));
		DiagonalStar.printSquareStar(8);
//		InputCalculator.inputThenPrintSumAndAverage(); //Commented out due to user input
		System.out.println(PaintJob.getBucketCount(4, 5, 1.3));
	}
	
	public static void printClassName(String classname) {
		System.out.println(classname);
	}
}
