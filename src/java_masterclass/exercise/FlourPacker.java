package java_masterclass.exercise;

public class FlourPacker {
	public static boolean canPack (int bigCount, int smallCount, int goal) {
		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		
		boolean ret = false;
		
		bigCount *= 5;
		
		if (bigCount + smallCount >= goal) {
			
			while(bigCount > 0) {
				if (goal >= 5) {
					goal -= 5;
				}
				bigCount -= 5;
			}
			
			if (smallCount >= goal) {
				ret = true;
			}
		}
		
		return ret;
	}
}
