package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String cardNumber="6541-8907-8754-0200";
	Pattern pt=Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
	Matcher mt=pt.matcher(cardNumber);
	String maskedCard= mt.replaceAll("xxxx-xxxx-xxxx-");
	System.out.println(maskedCard);
	}

}
