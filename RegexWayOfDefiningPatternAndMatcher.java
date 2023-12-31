package EY2508;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexWayOfDefiningPatternAndMatcher {

	public static void main(String[] args) {
		// compiled representation of regular expression
		Pattern p=Pattern.compile(".o");
		//.o- one character before o
		//o.-one character after o
		//.o.-one character on either side of o
		
		Matcher m=p.matcher("Co");
		boolean result=m.matches();
		System.out.println("Match Result- "+result);
		
		boolean sameResult2=Pattern.compile(".a").matcher("a").matches();
		System.out.println("Result is "+sameResult2);
		
		boolean sameResult3=Pattern.matches(".q", "Pq");
		System.out.println("Result is "+sameResult3);

	}

}
