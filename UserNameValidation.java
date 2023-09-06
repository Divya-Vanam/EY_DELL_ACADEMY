package EY2508;

import java.util.regex.Pattern;

public class UserNameValidation {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd34"));//true
		//a-zA-Z0-9 user name can include lower case and upper case alphabets and digits from 0 to 9
		//{6} indicates the length of the user name 
		//"abcd34" is the user name 
		// it shouldn't contain any special characters
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd347"));//false
		
		//Mobile number validation
		System.out.println(Pattern.matches("[6789]{1}[0-9]{9}", "9898989899"));//true
		//[6789]{1} indicates that the number should start with either 6/7/8/9 {1} is length i.e. only 1 number
		//[0-9]{9} indicates that numbers 0-9 can be used with the length 9
		
		//trim function is only used to remove leading and trailing white space in string 
		//whereas with replace, you can remove white spaces from within
		
		String str="   Java Example Trim    Function   ";
		System.out.println(str.trim());
		System.out.println(str.replaceAll("\\s+", ""));




	}

}
