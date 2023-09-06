package C1708;
class Parent2{
	void show() {
		System.out.println("Parent class function");
	}
	int data=10;
}
public class Runtimepolymorphism extends Parent2{
	@Override
	void show() {
		System.out.println("child class function");
	}
	int data =20;
	void display() {
		//this keyword refers to current class
		//super keyword refers to immediate parent class
		this.show();
		System.out.println("The value is "+this.data);
		super.show();
		System.out.println("The value is "+super.data);
	}

	public static void main(String[] args) {
		Parent2 obj=new Parent2();
		obj.show();
		System.out.println("The data is "+obj.data);
		
		Runtimepolymorphism obj2=new Runtimepolymorphism();
		obj2.show();
		System.out.println("The data is "+obj2.data);
		
		
		Parent2 obj3=new Runtimepolymorphism();
		obj3.show();
		System.out.println("The data is "+obj3.data);
		obj2.display();

	}

}
