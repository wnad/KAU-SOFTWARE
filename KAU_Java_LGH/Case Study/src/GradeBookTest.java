
public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gradeArray = {87,68,94,100,83,78,85,91,76,87};
		
		GradeBook myGradeBook = new GradeBook("CS101 Indroduction to JAva Programming", gradeArray);
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
	}

}
