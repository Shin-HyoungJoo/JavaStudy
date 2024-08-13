package mid.one.exception.ex4;

import java.util.Scanner;

/*
 * 체크 예외가 점점 많아짐에 따라,
 * throws가 덕지덕지 붙게 되었고
 * 언체크 예외를 쓰는것이 효율적이게 되었다.(extents Exception이 아닌 extents RuntimeException)
 * 그래서 예외 커스텀 시 RuntimeException를 상속 받아서 필요한 예외만 잡아 처리하고 나머진 그냥두자.
 * try-with-resources를 사용하여 자원들을 close하는것이 finally보다 가독성이나 안정성으로나 좋다.
 * 
 */
public class MainV4 {
	public static void main(String[] args) {
//		NetworkServiceV4 networkService = new NetworkServiceV4();
		NetworkServiceV5 networkService = new NetworkServiceV5();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("전송할 문자: ");
			String input = scanner.nextLine();
			if (input.equals("exit")) {
				break;
			}
			try {
				networkService.sendMessage(input);
			} catch (Exception e) { // 모든 예외를 잡아서 처리
				exceptionHandler(e);
			}
			System.out.println();
		}
		System.out.println("프로그램을 정상 종료합니다.");
	}

	// 공통 예외 처리
	private static void exceptionHandler(Exception e) {
		// 공통 처리
		System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
		System.out.println("==개발자용 디버깅 메시지==");
		e.printStackTrace(System.out); // 스택 트레이스 출력
		// e.printStackTrace(); // System.err에 스택 트레이스 출력
		// 필요하면 예외 별로 별도의 추가 처리 가능
		if (e instanceof SendExceptionV4) {
			SendExceptionV4 sendEx = (SendExceptionV4) e;
			System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
		}
	}
}
