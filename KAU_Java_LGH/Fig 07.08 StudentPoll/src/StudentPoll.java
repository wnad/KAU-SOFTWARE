
public class StudentPoll {

	public static void main(String[] args) {
		
		int[] responses = {1,2,6,4,8,5,9,7,8,10,1,6,3,8,6,10,3,8,2,7,6,5,7,6,8,6,7,5,6,6,5,6,7,5,6,4,8,6,8,10};
		int[] frequency = new int[11];
		
		for(int answer = 0; answer < responses.length; answer++)
			++frequency[responses[answer]];
		
		System.out.printf("%s%10s", "Rating", "Frequency");
		
		for (int rating = 1; rating < frequency.length; rating++)
			System.out.printf("%d%10d", rating, frequency[rating]);
	}

}
