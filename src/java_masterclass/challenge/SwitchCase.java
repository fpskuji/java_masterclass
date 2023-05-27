package java_masterclass.challenge;

public class SwitchCase {
	static void challenge () {
		char letter;
		
		//JDK 7, include strings for switch statements.
		//switches are good when you are checking a single variable many times.
		Main.printClassName("\nSwitchCase");
		letter = 'A';
		
		switch (letter) {
			case 'A':
				System.out.println("Found " + letter);
				break;
				
			case 'B':
				System.out.println("Found B");
				break;
				
			case 'C':
				System.out.println("Found C");
				break;
				
			case 'D':
				System.out.println("Found D");
				break;
				
			case 'E':
				System.out.println("Found E");
				break;
				
			default:
				System.out.println("Not found anything");
				break;
		}
	}
}
