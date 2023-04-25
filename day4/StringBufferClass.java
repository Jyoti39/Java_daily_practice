package StringClass;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer("wiley");
		StringBuffer sb1= new StringBuffer("wiley");
		StringBuffer sb2= new StringBuffer("wiley");
		String ss="wiley";
		//it gives true
		//System.out.println(ss.equals(sb1.toString()));
		//it gives false
		System.out.println(ss.equals(sb1));
		
		System.out.println(sb);
		//sb.append(" Edge");
		//System.out.println(sb);
		//sb.insert(4, "jj");
		//System.out.println(sb);
		//System.err.println(sb.reverse());
		System.out.println(sb.reverse());

	}

}
