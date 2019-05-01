
public class StudentPo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] responses = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7};
		int[] frequency = new int[11];
		
		for (int answer = 0; answer < responses.length; answer++)
			frequency[responses[answer]]++;
		
		System.out.printf("%s%s10s", "Rating", "Frequency");
		
		for (int rating = 1; rating < frequency.length; rating++)
			System.out.printf("%d%10d", rating, frequency[rating]);
	}

}
