package EY2408;

class Parent{
	void show() {
		System.out.println("Parent Class Function-show");
	}
	int data=10;
}

public class SuperKeywordExplaination extends Parent{

		@Override
		void show() {
			System.out.println("Child Class Function-show");
		}
		int data =20;
		void display() {
			System.out.println("The value of current class object data is "+this.data);
			System.out.println("The value of immediate parent class object is "+super.data);
			this.show();
			super.show();
		}
		public static void main(String[] args) {
			SuperKeywordExplaination obj=new SuperKeywordExplaination();
			obj.display();

	}

}
