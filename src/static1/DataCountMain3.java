package static1;

public class DataCountMain3 {
	public static void main(String[] args) {
		Counter counter = new Counter();
		Data3 data1 = new Data3("A");
		System.out.println("A count=" + Data3.count);
		Data3 data2 = new Data3("B");
		System.out.println("B count=" + Data3.count);
		Data3 data3 = new Data3("C");
		System.out.println("C count=" + Data3.count);
		//일반 필드는 힙영역에 저장, 객체마다 저장된다. static 필드는 메서드 영역(중의 static 영역)에 저장, 대상 클래스에 저장된다.
		//각 객체들은 static 필드를 메서드 영역 안에 있는 static영역에 저장된 해당 필드에게로 접근하게 된다.
		
		//추가
		//인스턴스를 통한 접근(비추천, 타인이 인스턴수 변수인것처럼 혼동할수있다.)
		Data3 data4 = new Data3("D");
		System.out.println(data4.count);
		//클래스를 통합 접근
		System.out.println(Data3.count);
	}
}
