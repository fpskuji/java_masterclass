package java_masterclass.challenge;

public class Methods {
	static void challenge() {
		String names[] = {"Andre", "Luka", "Clint", "Lesley"};
		int scores[] = {1500, 900, 400, 50};
		int iter;
		
		Main.printClassName("\nMethods");
		
		for (iter=0;iter<4;iter++) {
			displayHighScorePosition(names[iter], calculateHighScorePosition(scores[iter]));
		}
		
	}
	
	private static void displayHighScorePosition(String name, int pos) {
		System.out.println(name + " managed to get into position " + pos);
	}
	
	private static int calculateHighScorePosition(int score) {
		int ret = 4;
		
		if (score > 1000) {
			ret = 1;
		} else if (score > 500) {
			ret = 2;
		} else if (score > 100) {
			ret = 3;
		}
		
		return ret;
	}
}
