package IOstreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamClass {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("E:\\data\\data2.txt");
		DataOutputStream dos=new DataOutputStream(fout);
		dos.writeBytes("I am Jyoti Singh");
		dos.flush();
		dos.close();
		FileInputStream fin=new FileInputStream("E:\\data\\data2.txt");
		DataInputStream dis=new DataInputStream(fin);
		int count=fin.available();
		byte[] ba=new byte[count];
		dis.read(ba);
		for(byte b:ba) {
			System.out.println((char)b);
		}
		
		dis.close();
		fin.close();

	}

}
