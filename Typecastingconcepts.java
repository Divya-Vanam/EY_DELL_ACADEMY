package EY_140823;

class Machine{
	void start() {
		System.out.println("Machine has started!!");
	}
	void stop() {
		System.out.println("Machine has stopped!!");
	}
}
class Camera extends Machine{
	@Override //good programmer practice (annotation saying that inheritance is taking place)
	void start() {
		System.out.println("Camera has started!!");
	}
	void snap() {
		System.out.println("Picture clicked!!");
	}

}
public class Typecastingconcepts {

	public static void main(String[] args) {
		Machine m=new Machine();
		m.start();
		m.stop();
		Camera c =new Camera();
		c.start();
		c.snap();
		c.stop();
		Machine pc= new Camera();//upcasting 
		pc.start();
		pc.stop();
		
		//downcasting 
		Machine m2=new Camera();
		Camera c2=(Camera)m2;//downcasting 
		c2.start();
		c2.snap();
		c2.stop();
		//upcasting automatically
		Machine m3=c;
		m3.start();
		m3.stop();

	}

}
