package C1708;

public class Finallyalwaysworks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=samplemethod();
				System.out.println("Result is "+res);

	}
	static int samplemethod() {
		try {
			return 123;
		}finally {
			System.out.println("Codejust returning 123");
		}
	}

}
