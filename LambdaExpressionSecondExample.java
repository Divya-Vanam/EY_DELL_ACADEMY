package EY2208;

@FunctionalInterface
interface isFunctional{
	void show (String data);
}

public class LambdaExpressionSecondExample {

	public static void main(String[] args) {
		isFunctional obj=new isFunctional() {
		 @Override
		 public void show(String data) {
			 System.out.println("Using Anonymous inner "+data);
		 }
		};
		obj.show("Class way of implementation");
		
		isFunctional obj2=(demoData)->{
			System.out.println("Eliminating anonymous inner "+demoData);
		};
		obj2.show("Class way of implementation-Through Lambda Expressions");

	}

}
