package EY_140823;

public class Counter {
	int count;
	Counter(){
		count++;
		System.out.println("Value is "+count);
	}
	public static void main(String[] args) {
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();

	}

}
//for static... values =1,2,3 as it shares the same copy