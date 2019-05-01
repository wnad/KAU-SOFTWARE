
public class Increment {
	private int total = 0;
	private final int INCREMENT;
	
	public Increment (int incrementValue) {
		INCREMENT = incrementValue;
	}
	
	public void addIncrementToTotal() {
		total += INCREMENT;
	}
	
	public String toString() {
		return String.format("total = %d", total);
	}
}
