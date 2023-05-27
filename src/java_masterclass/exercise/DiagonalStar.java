package java_masterclass.exercise;

public class DiagonalStar {
	public static void printSquareStar (int number) {
		if (number < 5) {
			System.out.println("Invalid Value");
			return;
		}
		
		int i, j;
		
		for(i=0; i < number; i++) {
			for(j=0; j < number; j++) {
				if (i == 0 || i == number - 1 ||// Column start & end
					j == 0 || j == number - 1 ||// Row start & end
					i == j ||// Row and column are equal
					i == number - (j+1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
