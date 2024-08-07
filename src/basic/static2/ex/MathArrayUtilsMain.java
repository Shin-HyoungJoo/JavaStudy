package basic.static2.ex;

public class MathArrayUtilsMain {
	public static void main(String[] args) {
		int[] values = { 1};
		System.out.println("sum=" + MathArrayUtils.sum(values));
		System.out.println("average=" + MathArrayUtils.average(values));
		System.out.println("min=" + MathArrayUtils.min(values));
		System.out.println("max=" + MathArrayUtils.max(values));
	}
}
