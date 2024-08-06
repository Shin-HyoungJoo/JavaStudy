package static2.ex;

public class MathArrayUtils {
	public static int sum(int[] values) {
		isCountVaild(values);
//		if(isCountVaild2)
		int sum = 0;
		for (int i : values) {
			sum += i;
		}
		return sum;
	}

	public static float average(int[] values) {
		isCountVaild(values);
//		if(isCountVaild2)
		float average = 0L;
		int sum = 0;
		for (int i : values) {
			sum += i;
		}
		average = sum / values.length;
		return average;
	}

	public static int min(int[] values) {
		isCountVaild(values);
//		if(isCountVaild2)
		int min = values[0];
		for (int i = 1; i < values.length; i++) {
			if (min > values[i]) {
				min = values[i];
			}
		}
		return min;
	}

	public static int max(int[] values) {
		isCountVaild(values);
//		if(isCountVaild2)
		int max = values[0];
		for (int i = 1; i < values.length; i++) {
			if (max < values[i]) {
				max = values[i];
			}
		}
		return max;
	}

	public static void isCountVaild(int[] values) {
		if (values.length < 2) {
			throw new IllegalArgumentException("둘 이상의 숫자가 필요합니다.");
		}
	}
	
	public static boolean isCountVaild2(int[] values) {
		if (values.length < 2) {
			System.out.println("둘 이상의 숫자가 필요합니다.");
			return false;
		}
		return true;
	}
}