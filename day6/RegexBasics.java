package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String re=".";
		//String re="\\w";
		//String re="\\w\\s";
		//String text="S8";
		String re="\\d";
		String text="8";
		Pattern p=Pattern.compile(re);
		Matcher mt=p.matcher(text);
		boolean res=mt.matches();
		System.out.println(res);
		
	}

}
