package C1708;

import java.io.Serializable;

class InvalidAgeException extends Exception implements Serializable{
	InvalidAgeException (String message){
		super(message);
	}
}
public class LetsCreateCustomException {
	public static void main(String[] args) {
		try {
			validVoterStatus(17);
		}catch(InvalidAgeException e) {
			System.out.println("EXCEPTION MESSAGE IS "+e.getMessage());
		}
		System.out.println("Code will run smoothly afterwards");
	}
	static void validVoterStatus(int age) throws InvalidAgeException{
		if (age<18)
		throw new InvalidAgeException("USER CANNOT VISIT");
	}

}
