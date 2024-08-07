package poly.ex.pay1;

public class KakaoPay implements PayService{

	@Override
	public boolean pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("카카오페이 시스템과 연결합니다.");
		System.out.println(amount + "원 결제를 시도합니다.");
		return true;
	}

	@Override
	public String getOption() {
		// TODO Auto-generated method stub
		String name = "kakao";
		return name;
	}

}
