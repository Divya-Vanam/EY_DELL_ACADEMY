package EY2308;

public class YieldAndMinMaxPriority {

	public static void main(String[] args) {
		Thread producerThread=new Producer();
		Thread consumerThread=new Consumer();
		producerThread.setPriority(Thread.MAX_PRIORITY);//maximum priority is 10
		consumerThread.setPriority(Thread.MIN_PRIORITY);//minimum priority is 0
		producerThread.start();
		consumerThread.start();
	}

}
class Producer extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Producer thread is "+i);
			Thread.yield();
		}
	}
}
class Consumer extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Consumer thread is "+i);
			Thread.yield();
		}
	}
}
