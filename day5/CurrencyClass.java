package Random;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Currency rupees=Currency.getInstance("RUPEES");
	NumberFormat frm= NumberFormat.getCurrencyInstance(Locale.UK);
//		NumberFormat frm= NumberFormat.getCurrencyInstance( new Locale("en","IN"));
		String formattedval=frm.format(108.5);
		System.out.println(formattedval);
		
		//Formatting currency with Locale along with NumberFormat class
		double price = 2000.25;
		Locale local=new Locale("en","uS");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(local);
		String finalPrice = currencyFormatter.format(price);
		System.out.println(finalPrice);
		DecimalFormat decimalformatter=new DecimalFormat("#,##.0");
		decimalformatter.setPositivePrefix("$");
		String resVal=decimalformatter.format(price);
		System.out.println("custom format:- "+resVal);
		
	}
}