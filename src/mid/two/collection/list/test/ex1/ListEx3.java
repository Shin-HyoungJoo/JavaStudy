package mid.two.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("n개의 정수를 입력하세요 (종료 0)");

		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			list.add(num);
		}
		int sum = 0;
		double average = 0;
		
		for (Integer integer : list) {
			sum += integer.intValue();
		}
		
		average = (double) sum / list.size();
		
		System.out.printf(("입력한 정수의 합계: %d"), sum);
		System.out.println();
		System.out.printf(("입력한 정수의 평균: %.1f"), average);
	}
}
