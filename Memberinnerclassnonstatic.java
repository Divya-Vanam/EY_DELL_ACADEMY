package EY_140823;

public class Memberinnerclassnonstatic {
	private int data=10;
	class ABC{
		void show() {
			System.out.println("The value of data is "+data);
		}
	}

	public static void main(String[] args) {
		Memberinnerclassnonstatic obj=new Memberinnerclassnonstatic();
		Memberinnerclassnonstatic.ABC obj1= obj.new ABC();
		obj1.show();

	}

}
//method inside the inner class