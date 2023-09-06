package EY2408;

public class Example1 {

	public static void main(String[] args) {
		String str="Computer";
		str=str.toLowerCase();
		String str2=str.substring(0, 2);
		String str1=str.substring(2);
		String s="";
		for(int i=str2.length()-1;i>=0;i--) {
			s=s+str2.charAt(i);
		}
		System.out.println(s+str1);
		
	}
		
		
	
	/*	for(int i=0;i<2;i++) {
			char ch =str.charAt(i);
			char temp='';
			ch[i]=temp;
			ch[i+1]=ch[i];
			ch[i+1]=temp;
			str1=str1+ch;
		}
		for(int i=2;i<str.length();i++) {
			char b=str.charAt(i);
			str1=str1+b;
		}
		System.out.println(str1);
				
*/


	

}
