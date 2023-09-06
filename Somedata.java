package EY_140823;
@FunctionalInterface
interface Sampledata{
	void fullname(String firstname,String lastname);
}
public class Somedata implements Sampledata{

	
	@Override
	public void fullname(String firstname, String lastname) {
		System.out.println("Name is "+firstname+" "+lastname);
		
	}
	public static void main(String[] args) {
		Somedata obj=new Somedata();
		obj.fullname("abc","xyz");

	}


}
