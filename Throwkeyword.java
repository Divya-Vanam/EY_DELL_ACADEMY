package C1708;

import java.io.IOException;

public class Throwkeyword {

	public static void main(String[] args) {
		samplemethod();
		System.out.println("Rest of the code....");

	}
	static void samplemethod() {
		try {
			throw new IOException("DEVICE ERROR");
		}catch(IOException e) {
			System.out.println("EXCEPTION HANDLED");
		}
	}

}
