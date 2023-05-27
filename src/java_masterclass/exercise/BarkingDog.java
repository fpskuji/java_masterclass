package java_masterclass.exercise;

public class BarkingDog {
	public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
		return ((hourOfDay > -1 && hourOfDay < 8 && barking) || (hourOfDay == 23 && barking))?true:false;
	}
}
