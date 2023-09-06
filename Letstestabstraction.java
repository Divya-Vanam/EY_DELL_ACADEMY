package EY_140823;
abstract class Shape{
	//unique functionality-define
	abstract void draw();//declaration
	int length,breath,height,area,radius;
	double areaofCircle;
	void purpose() {
		System.out.println("Calculate the area of different shapes");
	}
	
}
class Triangle extends Shape{

	@Override
	void draw() {
		purpose();//if the method in abstract class has abstract method, they have to override it
		int breath=20,height=30;
		area=(breath*height)/2;
		System.out.println("Area of triangle is "+area);		
	}
	
}
class Rectangle extends Shape{

		@Override
		void draw() {
			int length=20,breath=30;
			area=breath*length;
			System.out.println("Area of reactangle is "+area);				
	}
	
}
class Circle extends Shape{

	@Override
	void draw() {
		int radius=5;
		areaofCircle=2*Math.PI*radius;
		System.out.println("Area of circle is "+areaofCircle);
		
	}
	
}


public class Letstestabstraction {
	public static void main(String[] args) {
	Shape tri= new Triangle();
	tri.draw();
	Shape rect=new Rectangle();
	rect.draw();
	Shape circ=new Circle();
	circ.draw();
	}

}
