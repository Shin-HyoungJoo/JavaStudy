package basic.poly.ex.pay1;

public class PayMain0 {
	public static void main(String[] args) {
		PayService kakaoService = new KakaoPay();
		int kakaoAmount = 5000;
		processPay(kakaoService, kakaoAmount);

		PayService naverService = new NaverPay();
		int naverAmount = 10000;
		processPay(naverService, naverAmount);

		PayService badService = null;
		int badAmount = 15000;
		processPay(badService, badAmount);
	}

	private static void processPay(PayService payService, int amount) {
		String option = "";

		if (payService != null) {
			option = payService.getOption();
			System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
			boolean result = payService.pay(amount);
			
			if (result) {
				System.out.println("결제가 성공했습니다.");
			}
			
		} else {
			option = "bad";
			System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
			System.out.println("결제 수단이 없습니다.");
			System.out.println("결제가 실패했습니다.");
		}
	}
}