package StringClass;

import java.util.Arrays;
import java.util.List;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String title="Java Developer";
      float salary=2000.3999f;
     // System.out.format("%s has %.3f USD salary" , title,salary);
      List<String> techStack=Arrays.asList(
    		  "First",
    		  "Second",
    		  "Third");
      for(String book:techStack) {
    	  //it will print after 30 character the next book 
    	  System.out.format("%-30s - In stock%n",book);
      }
	}

}
