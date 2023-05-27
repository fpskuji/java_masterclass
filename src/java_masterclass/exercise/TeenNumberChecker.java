package java_masterclass.exercise;

public class TeenNumberChecker {
	public static boolean hasTeen (int x, int y, int z) {
		
		if(isTeen(x) || isTeen(y) || isTeen(z)) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isTeen (int x) {
		return (12 < x && x < 20)?true:false;
	}
}
