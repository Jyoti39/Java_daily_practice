package StringClass;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Wiley";
		String s2="Wiley";
		String s3=new String("Wiley");
		String s4=new String("Wiley");
		//System.out.println(s1==s2);
		//System.out.println(s2==s3);
		//System.out.println(s3==s4);
		String str="I am a Java Developer";
		String str1="Python";
		////System.out.println(str.length());
		System.out.println(str.charAt(10));
		//String str2=str.concat(str1);
		String str2 = str.concat(" ").concat(str1);
		//System.out.println(str2);
		String fname="jyoti";
		String lname="Singh";
		String result=fname.concat(" ").concat(lname);
		System.out.println(result);
		System.out.println(str.replace("D" , "d"));
		String st[]=str.split(" ");
		for(String string:st) {
			System.out.println(string);
		}
	}
	

}
