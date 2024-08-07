package mid.one.lang.wrapper.test;

import java.util.Random;

public class LottoGenerator {
	public static void main(String[] args) {
		int[] numbers = new int[6];
		int count = 0;

		selectLotteNumber(numbers, count);
	}

	private static void selectLotteNumber(int[] lotteArr, int count) {
		Random random = new Random();
		System.out.print("로또 번호:");

		while (count < 6) {
			int number = random.nextInt(45) + 1;
			if (count == 0) {
				lotteArr[count] = number;
				count++;
				System.out.print(" " + number);
			} else {
				int beforeNumber = lotteArr[count - 1];
				if (isUnique(lotteArr, beforeNumber)) {
					continue;
				}
				lotteArr[count] = number;
				count++;
				System.out.print(" " + number);
			}
		}
	}

	private static boolean isUnique(int[] lotteArr, int number) {
		for (int lotteNum : lotteArr) {
			if (lotteNum == number)
				return false;
		}
		return true;
	}

}
