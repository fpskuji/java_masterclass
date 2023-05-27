package java_masterclass.challenge;

public class Operators {
	static void challenge() {
		double var1 = 20;
		double var2 = 80;
		double var3 = (var1 + var2) * 100;
		double var4 = var3 % 40;
		boolean var5 = (var4 == 0)?true:false;
		
		Main.printClassName("\nOperators");
		
		System.out.println("Values: ");
		System.out.println("1): " + var1);
		System.out.println("2): " + var2);
		System.out.println("3): " + var3);
		System.out.println("4): " + var4);
		System.out.println("5): " + var5);
		
		if (!var5) {
			System.out.println("Got some remainder");
		}
	}
}
