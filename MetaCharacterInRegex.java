package EY2508;

import java.util.regex.Pattern;

public class MetaCharacterInRegex {

	//\d-any Digit
	//\D-any non digit
	//[^0-9] anything other than 0 to 9
	public static void main(String[] args) {
		System.out.println(Pattern.matches("\\d", "abc"));//false
		System.out.println(Pattern.matches("\\d", "1"));//true
		
		System.out.println(Pattern.matches("\\d", "1234"));//false
		System.out.println(Pattern.matches("\\d*", "1234"));//true

		System.out.println(Pattern.matches("\\D", "a"));//true
		System.out.println(Pattern.matches("\\D*", "abc"));//true
		System.out.println(Pattern.matches("\\D*", "123"));//false
		
		System.out.println("Core Java     Regex".replaceAll("\\s+", ""));
		

	}

}
