package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DivideClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pt=Pattern.compile("^(\\d+) divide by (\\d+)$");
		Matcher mt=pt.matcher("10 divide by 5");
		if(mt.find()) {
			String simplified="result= " +mt.replaceFirst("$1/$2");
			int res=Integer.valueOf(mt.group(1))/Integer.valueOf(mt.group(2));
			System.out.println("Final result: "+res);
		}
	}

}
