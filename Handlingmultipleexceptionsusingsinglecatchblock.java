package C1708;

public class Handlingmultipleexceptionsusingsinglecatchblock {

	public static void main(String[] args) {
		try {
			Handlingmultipleexceptionsusingsinglecatchblock obj= new Handlingmultipleexceptionsusingsinglecatchblock();
			}catch( NullPointerException  | ArithmeticException | IndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}

	}

}
