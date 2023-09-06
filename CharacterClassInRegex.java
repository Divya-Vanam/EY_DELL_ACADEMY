package EY2508;

import java.util.regex.Pattern;

public class CharacterClassInRegex {
//[abc]-a or b or c
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]", "aa"));
		System.out.println(Pattern.matches("[amn]", "m"));
		System.out.println(Pattern.matches("[amn]", "mn"));
		//[] is called character class
		//[^amn]-any characters except a m or n
		System.out.println(Pattern.matches("[^amn]", "z"));
		//any alphabet lowercase or uppercase
		System.out.println(Pattern.matches("[a-zA-Z]", "B"));
		//A THROUGH D OR M THROUGH P
		System.out.println(Pattern.matches("[a-d[m-p]", "e"));


		




	}

}
