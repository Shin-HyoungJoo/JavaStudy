package access;

public class MaxCounter {
	private int count;
	private int max;

	public MaxCounter() {
		this(0);
	}

	public MaxCounter(int max) {
		this.count = 0;
		this.max = max;
	}

	public void increment() {
		if(isCountValid()) {
			count++;
		} else {
			System.out.println("최대값을 초과할 수 없습니다");
		}
	}

	public int getCount() {
		return count;
	}
	
	private boolean isCountValid() {
		return count < max;
	}
}
