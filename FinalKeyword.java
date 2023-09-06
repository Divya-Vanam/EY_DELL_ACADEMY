package EY1808;

public class FinalKeyword {
	final static String PANCARDNUMBER;
	//FinalKeyword(){
	static {
	PANCARDNUMBER="AHYPC126765J";
	//}
	}
	void display() {
		System.out.println("Final method");
	}
	

	public static void main(String[] args) {
		FinalKeyword obj=new FinalKeyword();
		System.out.println("obj is "+obj.PANCARDNUMBER);

	}

}
