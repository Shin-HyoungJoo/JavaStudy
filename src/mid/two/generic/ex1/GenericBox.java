package mid.two.generic.ex1;

public class GenericBox<T> {
	/*
	 * EX) class Data<K, V> {} 같이 중복 선언 가능
	 * 
	 * E - Element
	 * K - Key
	 * N - Number
	 * T - Type
	 * V - Value
	 * S, U, V etc. - 2nd, 3rd, 4th types
	 * 
	 */

	private T value;

	public void set(T value) {
		this.value = value;
	}
	
	public T get() {
		return value;
	}
}
