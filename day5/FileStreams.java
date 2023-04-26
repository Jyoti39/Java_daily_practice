package IOstreams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	/*	FileOutputStream fout= new FileOutputStream("E:\\data\\data4.txt");
		String str= "Wiley fullstack my project";
		byte []b=str.getBytes();

		fout.write(b);
		fout.flush();
		fout.close();
	}*/
	FileInputStream fin=new FileInputStream("E:\\data\\data4.txt");
	int i=0;
	while((i=fin.read())!=-1) {
		System.out.println((char)i);

}
	fin.close();

}
}
