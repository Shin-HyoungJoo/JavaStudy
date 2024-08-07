package basic.poly.ex.sender;

public class EmailSender implements Sender{

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("메일을 발송합니다: " + message);
	}

}
