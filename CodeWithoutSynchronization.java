package EY2308;

 class SharedResource {
	 void print(int n) {//we used synchronized keyword here to synchronize the thread ,, synchronized keyword can be
		for(int i=1;i<=5;i++) {//used before void
			//synchronized(this{//synchronized block
			System.out.println(n*i);//}
			try {
				Thread.sleep(i);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

 class MyThread1 extends Thread{
	 SharedResource sR;
	 
	 MyThread1(SharedResource sR){
		 this.sR=sR;
	 }
	 public void run() {
		 sR.print(5);
	 }
 }
 class MyThread2 extends Thread{
	 SharedResource sR;
	 
	 MyThread2(SharedResource sR){
		 this.sR=sR;
	 }
	 public void run() {
		 sR.print(10);
	 }
 }
public class CodeWithoutSynchronization {

	public static void main(String[] args) {
		SharedResource obj=new SharedResource();
		
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
