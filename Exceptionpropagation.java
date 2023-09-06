package C1708;

public class Exceptionpropagation {

	public static void main(String[] args) {
		System.out.println("MAIN METHOD ");
		try {
			Exceptionpropagation obj=new Exceptionpropagation();
			obj.a();
		}catch(InterruptedException e) {
			System.out.println("Main method "+e.getMessage());
		}

	}
	void a()throws InterruptedException{
		System.out.println("METHOD A");
		b();
	}
	void b()throws InterruptedException{
		System.out.println("METHOD B");
		c();
		throw new InterruptedException("THREAD ERROR");
	}
	void c() {
		System.out.println("METHOD C");
	}

}
