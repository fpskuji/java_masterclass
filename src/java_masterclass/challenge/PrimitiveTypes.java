package java_masterclass.challenge;

//import java.util.Scanner;

public class PrimitiveTypes {
	static void challenge() {
		byte fstNumber = 10;
		short sndNumber = 20;
		int trdNumber = 30;
		long fthNumber = 50000;
		int total = (int) fthNumber + 10 *(fstNumber + sndNumber + trdNumber);
		
		Main.printClassName("\nPrimitiveTypes");
		
		// Warning, literal values use Integer/Double as default;
		// Generally better to use double than float as it is more precise;
		int intMinVal = Integer.MIN_VALUE;
		int intMaxVal = Integer.MAX_VALUE;
		
		char charMinVal = Character.MIN_VALUE;
		char charMaxVal = Character.MAX_VALUE;
		
		byte byteMinVal = Byte.MIN_VALUE;
		byte byteMaxVal = Byte.MAX_VALUE;
		
		short shortMinVal = Short.MIN_VALUE;
		short shortMaxVal = Short.MAX_VALUE;
		
		long longMinVal = Long.MIN_VALUE;
		long longMaxVal = Long.MAX_VALUE;
		
		float floatMinVal = Float.MIN_VALUE;
		float floatMaxVal = Float.MAX_VALUE;
		
		double doubleMinVal = Double.MIN_VALUE;
		double doubleMaxVal = Double.MAX_VALUE;
		
		boolean booleanMinVal = Boolean.FALSE;
		boolean booleanMaxVal = Boolean.TRUE;
		
		System.out.println("Int min/max value: " + intMinVal + "/" + intMaxVal);
		System.out.println("Char min/max value: " + (int)charMinVal + "/" + (int)charMaxVal);
		System.out.println("Byte min/max value: " + byteMinVal + "/" + byteMaxVal);
		System.out.println("Short min/max value: " + shortMinVal + "/" + shortMaxVal);
		System.out.println("Long min/max value: " + longMinVal + "/" + longMaxVal);
		System.out.println("Float min/max value: " + floatMinVal + "/" + floatMaxVal);
		System.out.println("Double min/max value: " + doubleMinVal + "/" + doubleMaxVal);
		System.out.println("Boolean min/max value: " + booleanMinVal + "/" + booleanMaxVal);
		System.out.println("Arithmetics: " + total);
		
		//Convert lbs to kg
		double lbs;
		
		System.out.println("Input lbs:");
		
//		try (Scanner sc = new Scanner(System.in)) {
//			lbs = sc.nextDouble();
			lbs = 180;
			lbs *= .45359237;
//		}
		
		System.out.println("KG value: " + lbs);
	}
}
