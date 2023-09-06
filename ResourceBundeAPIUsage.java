package EY2808;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundeAPIUsage {

	public static void main(String[] args) {
		ResourceBundle rs=ResourceBundle.getBundle("EY2808.TestBundle");
		displayValues(rs);
		Locale swedishLocale=new Locale("sv","SE");
		ResourceBundle rs2=ResourceBundle.getBundle("EY2808.TestBundle",swedishLocale);
		displayValues(rs2);
		

	}
	static void displayValues(ResourceBundle bundle) {
		System.out.println("Hello message: "+bundle.getString("my.hello"));
		System.out.println("Hello message: "+bundle.getString("my.bye"));
		System.out.println("Hello message: "+bundle.getString("my.question"
				+ ""));
	}

}
