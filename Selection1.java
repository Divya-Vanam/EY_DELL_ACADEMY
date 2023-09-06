package EY_140823;

public class Selection1 {

	public static void main(String[] args) {
		// switch case
		grading('A');
		grading('B');
		grading('C');
		grading('D');

	}
	public static void grading(char grade) {
		int success;
		switch(grade) {
		case 'A':
			success=1;
			System.out.println("Excellent grade");
			break;
		case 'B':
		case 'C':
			success=0;
			System.out.println("Good grade");
			break;
		default:
			success=-1;
			System.out.println("Unknown grade");
					
		}
		passthecourse(success);
		
	}
	static void passthecourse(int success) {
		switch(success) {
		case 1:
			System.out.println("Passed the course");
			break;
		case 0:
			System.out.println("Can write the exam again");
			break;
		case -1:
			System.out.println("Reschedule the course");
			break;
		}
	}
	
		


}
