package java_masterclass.exercise;

public class NumberToWords {
	public static void numberToWords(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
		}

		int digitCounter;

		digitCounter = getDigitCount(number);
		number = reverse(number);

		while (number > 0 || digitCounter > 0) {
			int digit = number % 10;

			switch (digit) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			default:
				System.out.println("Invalid Value");
				break;
			}
			number /= 10;
			digitCounter--;
		}
	}

	public static int reverse(int number) {
		int ret = 0;

		while (number != 0) {
			ret *= 10;
			ret += number % 10;
			number /= 10;
		}

		return ret;
	}

	public static int getDigitCount(int number) {
		if (number < 0) {
			return -1;
		} else if (number == 0) {
			return 1;
		}

		int ret = 0;

		for (ret = 0; number > 0; ret++) {
			number /= 10;
		}

		return ret;
	}
}
