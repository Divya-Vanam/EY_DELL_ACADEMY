package EY2408;

import java.util.Optional;

//to avoid overhead of checking null object again and again
public class NeedOfOptionalClass {

	public static void main(String[] args) {
		String[] words =new String[10];
	/*	this is just to avoid null pointer exception 
	 * String word="";
		if(null!=words[5]) {
			 word=words[5].toLowerCase();
		}else {
			System.out.println("value at 5th index was null");
		}
		System.out.println(word);
		*/
		Optional<String> checkNull=Optional.ofNullable(words[5]);
		if(checkNull.isPresent()) {
			String word=words[5].toLowerCase();
			System.out.println(word);
		}else {
			System.out.println("Word is null");
		}

	}

}
