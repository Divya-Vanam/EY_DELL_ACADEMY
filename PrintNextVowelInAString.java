package EY2208;

import java.util.HashMap;

//a,e,i,o,u
public class PrintNextVowelInAString {

	public static void main(String[] args) {
		String str="amitthakur";
		System.out.println("Next vowel in string is "+printNextVowel(str.toCharArray()));
		}
	public static String printNextVowel(char[] str) {
		HashMap<Character,Integer> hMap=new HashMap<Character,Integer>();
		hMap.put('a',0);
		hMap.put('e',1);
		hMap.put('i',2);
		hMap.put('o',3);
		hMap.put('u',4);
		
		char[] arr= {'a','e','i','o','u'};
		
		int lengthOfString=str.length;
		
		//iterate over entire string
		for(int i=0;i< lengthOfString;i++) {
			char c=str[i];
			//System.out.println("Character is "+c);

			if(c=='a' || c=='e' || c=='i'||c=='o'||c=='u') {
				//if current character is vowel,find the index in hash and replace
				//with next vowel from hash itself
				int index=hMap.get(c)+1;
				int newIndex=index%5;
				
				str[i]=arr[newIndex];
						
			}
		}
		return String.valueOf(str);
	}

}
