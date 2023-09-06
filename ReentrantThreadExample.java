package EY2308;

class Reenterant{
	public synchronized void m() {
		n();
		System.out.println("I am in m synchronizd method");
	}
	public synchronized void n() {
		System.out.println("I am in n synchronized method");
	}
}
public class ReentrantThreadExample {

	public static void main(String[] args) {
		final Reenterant r= new Reenterant();
				new Thread() {
					public void run() {
						r.m();
					}
		}.start();
		// 4 types of final... 
		// final class cannot be inherited
		////final method
		//final constructor
		//final static interference through

	}

}
