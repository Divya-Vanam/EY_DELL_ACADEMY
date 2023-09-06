package EY2408;

public class ImmutableClass {

	public static void main(String[] args) {
		String str=new String("ABC");
		System.out.println("After first step "+str);
	       str.concat("--XYZ");//doesnot concat as string is immutable class
		//str=str.concat("--xyz");//creates a new object as str and concats the parameter 
		System.out.println("After second step "+str);
		
		StringBuilder sb=new StringBuilder("ABC");
		System.out.println("AFTER 1ST STEP "+sb);
		sb.append("--xyz");
		System.out.println("AFTER SECOND STEP "+sb);
		

	}

}
