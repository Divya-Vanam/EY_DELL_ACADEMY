package EY2408;

interface TestInterface{
	public void square(int a);
	
	default void show() {
		System.out.println("Only for one class,default method is defined "+"so that other don't have to implement this");
	}
	}

public class DefaultKeywordFunctionality implements TestInterface{

	@Override
	public void square(int a) {
		System.out.println(a*a);
		
	}
	public static void main(String[] args) {
		DefaultKeywordFunctionality obj=new DefaultKeywordFunctionality();
		obj.square(4);
		obj.show();

	}

}
