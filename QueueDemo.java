package EY1808;
class Queue{
	int front;
	int rear;
	int[] arr;
	Queue(){
		front=rear=-1;// -1 indicates that the queue is empty data can be  added
		arr=new int[10];
	}
	void enQueue(int a) {
		if(rear == arr.length-1) {
			System.err.println("Overflow Alert");
		}else
			arr[++rear]=a;
		
		if(front==-1) {
			front++;
		}
	}
	int dequeue() {
		int x=-1;
		if(front==-1) {
			System.out.println("Underflow");
		}else
			x=arr[front++];
		
		if(rear==0) 
			rear--;
			return x; 
		}
		void display() {
			for(int i=front;i<=rear;i++)
				System.out.println(arr[i]+" ");
			
			System.out.println();
		}
	}

public class QueueDemo {
	
	

	public static void main(String[] args) {
		Queue  ob=new Queue();
		ob.enQueue(1);
		ob.enQueue(2);
		ob.enQueue(3);
		ob.enQueue(4);
		ob.enQueue(5);
		ob.enQueue(6);
		ob.enQueue(7);
		ob.enQueue(8);
		ob.display();
		ob.dequeue();
		ob.display();
	}

}
