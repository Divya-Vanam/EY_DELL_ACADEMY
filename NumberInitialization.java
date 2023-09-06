package EY_140823;

public class NumberInitialization {
	int num1;
	static int num2;
	static {
		System.out.println("Static initialization block");
		num2=100;
	}
	NumberInitialization(){
		num1=77;
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println("The value of num2 is "+num2);
		
		NumberInitialization obj=new NumberInitialization();
		System.out.println("The value of num1 is "+obj.num1);

	}
 
}
