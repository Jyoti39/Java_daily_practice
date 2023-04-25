package IOstreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BOStream {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("E:\\data\\data1.txt");
		BufferedOutputStream bof=new  BufferedOutputStream(System.out);
		
		String str =" I am a Programmer ";
		byte[] b=str.getBytes();
		try {
			bof.write(b);
			bof.flush();
			bof.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
