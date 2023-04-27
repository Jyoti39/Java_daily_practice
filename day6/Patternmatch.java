package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternmatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pattern pr= Pattern.compile("agent \\d\\d\\d");
		//Pattern pt=Pattern.compile("agent \\d{3}");
		Pattern pt=Pattern.compile("^[a|A]agent (\\d{3,4}$)");
		Matcher mt=pt.matcher("agent 0007");
		boolean found=mt.find();
		boolean match=mt.matches();
		if(mt.find()) {
			System.out.println("Group: " +mt.group());
			System.out.println("Group: " +mt.group(1));
		}
//		System.out.println("Found : "+found);
//		System.out.println("Match: " +match);
	}

}
