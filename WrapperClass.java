package C1708;

public class WrapperClass {
//////wrapping is also called autoboxing-data type ko object banana
	public static void main(String[] args) {
		byte grade=2;
		short marks=20;
		float price=8.3f;
		double rate=240.3D;
		boolean flag=false;
		char initial='A';
		///WRAPPER CLASSES ARE IMMUTABLE WHOSE ORIGINAL CONTENT CANNOT BE MODIFIED
		//autoboxing--to get a object out of data type-wrapper class
		Byte bObject=new Byte(grade);//depricated?
		Short sObject=new Short(marks);
		System.out.println("Data type grade is "+grade);
		System.out.println("Object bObject is "+bObject);
		
		//unboxing
		byte byteValue=bObject.byteValue();
		System.out.println(byteValue);

	}

}


