package StringClass;

import java.util.StringTokenizer;

public class StringTokenclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String input="We ,love ,java, programming";
   StringTokenizer st= new StringTokenizer(input," ,");
    System.out.println(st.countTokens());
    while(st.hasMoreElements()) {
    	System.out.println(st.nextToken());
    }
	}

}
