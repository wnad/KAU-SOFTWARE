
public class Time2 {
	private int hour;
	private int minute;
	private int second;
	
	public Time2() {
		this(0, 0, 0);
	}
	
	public Time2(int h) {
		this(h, 0, 0);
	}
	
	public Time2(int h, int m) {
		this(h,m,0);
	}
	
	public Time2(int h, int m, int s) {
		setTime(h,m,s);
	}
	
	public Time2 ( Time2 time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setTime(int h, int m, int s) {
		hour = ((h >= 0 && h < 24) ? h : 0);
		minute = ((m >= 0 && m < 60) ? m : 0);
		second = ((s >= 0 && s < 60) ? s : 0);
	}
	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toString() {
		return String.format("%d:%02d:%02d %s", 
				(( hour == 0 || hour == 12) ? 12 : hour % 12),
				minute, second, (hour < 12 ? "AM" : "PM"));
	}
}
