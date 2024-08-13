package mid.one.exception.ex4;

public class NetworkClientV5 implements AutoCloseable {

	//try-with-resources 사용조건 - AutoCloseable 구현. 
	//sqlssion 적용은 mybatis 3.2 버전부터 사용가능
	private final String address;
	public boolean connectError;
	public boolean sendError;

	public NetworkClientV5(String address) {
		this.address = address;
	}

	public void connect() {
		if (connectError) {
			throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
		}
		System.out.println(address + " 서버 연결 성공");
	}

	public void send(String data) {
		if (sendError) {
			throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
		}
		System.out.println(address + " 서버에 데이터 전송: " + data);
	}

	public void disconnect() {
		System.out.println(address + " 서버 연결 해제");
	}

	public void initError(String data) {
		if (data.contains("error1")) {
			connectError = true;
		}
		if (data.contains("error2")) {
			sendError = true;
		}
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("NetworkClientV5.close");
		 disconnect();
		
	}
}
