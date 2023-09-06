package EY_140823;

public class Localinnerclass {
	private int data=20;
	void message() {
		class xyz{
			void show() {
				System.out.println("The value is "+data);

			}
		}
		xyz obj=new xyz();
		obj.show();
	}

	public static void main(String[] args) {
		Localinnerclass obj2=new Localinnerclass();
		obj2.message();

	}

}
