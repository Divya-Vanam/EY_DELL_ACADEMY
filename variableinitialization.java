package EY_140823;

public class variableinitialization {
	int number;
	variableinitialization(){//no arg constructor
		number=100;
	}
	variableinitialization(int number){//parameterized constructor
		this.number=1000;
	}
	public static void main(String[] args) {
		variableinitialization obj =new variableinitialization();
		System.out.println(obj.number);
		variableinitialization obj2 =new variableinitialization(1000);
		System.out.println(obj2.number);
	}
	

}
