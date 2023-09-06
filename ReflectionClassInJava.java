package EY2108;

class SampleClass{}
interface MyInterface{}

public class ReflectionClassInJava {
	
	void printName(Object obj) {
		Class c=obj.getClass();
		System.out.println(c.getCanonicalName());
		System.out.println(c.getName());
	}

	public static void main(String[] args) throws ClassNotFoundException{
		
		SampleClass obj=new SampleClass();
		
		ReflectionClassInJava rC= new ReflectionClassInJava();
		rC.printName(obj);
		
		//examining and modifying the behaviour of the class
		Class c=boolean.class;
		System.out.println(c.getName());
		
		Class c2=ReflectionClassInJava.class;
		System.out.println(c2.getName());
		
		//forName is used to load the class dynamically-
		// returns the instance of class
		Class c4=Class.forName("EY2108.ReflectionClassInJava");
		System.out.println(c4.getName());

	}

}
