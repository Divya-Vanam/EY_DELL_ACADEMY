package EY2808;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class NumberFormatAPI {

	public static void main(String[] args) {
		long number=50000L;
		
		NumberFormat nf=NumberFormat.getInstance();
		System.out.println("Number Format using Default Locale is "+nf.format(number));

		NumberFormat itlynf=NumberFormat.getInstance(Locale.ITALY);
		System.out.println("Number Format using Itly Locale is "+itlynf.format(number));
		
		NumberFormat defaultcurrency=NumberFormat.getCurrencyInstance();
		System.out.println(" currency-Number Format using Default Locale is "+defaultcurrency.format(number));
		
		NumberFormat usingitaliancurrency=NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println("currency-Number Format using Itly Locale is "+usingitaliancurrency.format(number));
		
		Currency usd=Currency.getInstance("USD");
		NumberFormat uscurrency=NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("currency-Number Format using DItly Locale is "+uscurrency.format(1234));
		
		Date currentDate=new Date();
		DateFormat germanDf=DateFormat.getDateInstance(DateFormat.FULL,Locale.GERMANY);
		System.out.println("DATE FORMAT USING GERMAY LOCALE IS "+germanDf.format(currentDate));


	}

}
