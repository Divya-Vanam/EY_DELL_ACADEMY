package EY2508;

//instead of measuring actual time required in executing each statement
//time complexity consider how many times each statements execute

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");//once O(1)
		display();
	}
	static void display() {
		int n=8;
		for(int i=0;i<n;i++) {
			System.out.println("Heloo World!!!\n");//O(n)
		}
		for(int i=1;i<n;i=i*2) {
			System.out.println("Heloo World!!!\n");//O(log2(n))
		}
		for(int i=0;i<n;i=(int)Math.pow(i, 2)) {
			System.out.println("Heloo World!!!\n");//O(log(log(n)))
		}
		
	}

}
