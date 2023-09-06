package EY2408;
//this variable resolves the ambiguity between local variable,instance variable and method parameter
public class ThisKeywordUsage {
	
	//non static instance variable
	int data=30;
	void display() {
		//local variable
		int data =20;
		System.out.println("local variable value is "+data);
		System.out.println("instance variable value is "+this.data);
	}
	void display(int data) {
		//local variable
		System.out.println("method parameter variable is "+data);
		this.data=data;
		System.out.println("instance variable  value is "+this.data);
	}

	public static void main(String[] args) {
		ThisKeywordUsage obj=new ThisKeywordUsage();
		obj.display();
		obj.display(40);
		obj.display();

	}

}
