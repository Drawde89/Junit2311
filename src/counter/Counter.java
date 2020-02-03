package counter;

public class Counter {
	
	private int count;
	
	public Counter () {
		count = 0;
	}
	
	public void increment() {
		count ++;
	}
	
	public void decrement() {
		count --; 
	}
	
	public void reset() {
		count = 0;
	}
	
	public void increment(int inc) {
		count += inc;
	}
	
	public void decrement(int dec) {
		count -= dec;
	}
	
	public int getCount() {
		return count;
	}
}
