package EY2308;
class SharedResources {
	synchronized static void print(int n) {//we used synchronized keyword here to synchronize the thread
		for(int i=1;i<=5;i++) {// static is shared to all the methods,
			//to call a static method, object is not required
			//synchronized(this){//synchronized block
			System.out.println(n*i);//}
			try {
				Thread.sleep(i);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
//every object shares unique non static variables and shares static variables/methods		
	}
}
class MyThread3 extends Thread{
	public void run() {
		SharedResources.print(5);
	}
}

class MyThread4 extends Thread{
	public void run() {
		SharedResources.print(10);
	}
}

class MyThread5 extends Thread{
	public void run() {
		SharedResources.print(15);
	}
}

class MyThread6 extends Thread{
	public void run() {
		SharedResources.print(20);
	}
}
public class StaticSynchronization {

	public static void main(String[] args) {
		MyThread3 t1=new MyThread3();
		MyThread4 t2=new MyThread4();
		MyThread5 t3=new MyThread5();
		MyThread6 t4=new MyThread6();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

