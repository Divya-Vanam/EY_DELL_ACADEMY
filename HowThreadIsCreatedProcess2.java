package EY2308;

public class HowThreadIsCreatedProcess2 implements Runnable{

	public static void main(String[] args) {
		HowThreadIsCreatedProcess2 obj= new HowThreadIsCreatedProcess2();
		Thread t1=new Thread(obj);//thread class is mandatory
		t1.start();

	}

	@Override
	public void run() {
		System.out.println("I am running automatically ");
		
	}//fn+f6 is used to move to another part of break thingi
	//f8 is terminator
	//f5 step in
	//F5  step in
	//F6  One after another running
	//F7  To jump after another
	//F8  termination

}
