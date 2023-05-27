package java_masterclass.exercise;

public class PlayingCat {
	public static boolean isCatPlaying (boolean summer, int temperature) {
		if (summer) {
			return (temperature < 25 || temperature > 45)?false:true;
		} else {
			return (temperature < 25 || temperature > 35)?false:true;
		}
	}
}
