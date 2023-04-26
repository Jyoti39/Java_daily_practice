package IOstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AbstractStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*InputStream fin=new FileInputStream("E:\\data\\data4.txt");
		int i=0;
		while((i=fin.read())!=-1) {
			System.out.println((char)i);

	}
		fin.close();

	}

	}*/
		OutputStream fout= new FileOutputStream("E:\\data\\data4.txt");
		String str= "Wiley fullstack my project ILT Sessions";
		byte []b=str.getBytes();

		fout.write(b);
		fout.flush();
		fout.close();
	}}


