package Random;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            // create a new file and write some data to it
	            RandomAccessFile file = new RandomAccessFile("testfile.txt", "rw");
	            file.writeBytes("Hello, Wiley!");

	            // read the data back from the file
	            file.seek(0);
	            byte[] bytes = new byte[13];
	            file.read(bytes);
	            String data = new String(bytes);

	            // print the data
	            System.out.println(data);

	            // write some more data to the file
	            file.seek(7);
	            file.writeBytes("Java");

	            // read the modified data back from the file
	            file.seek(0);
	            bytes = new byte[13];
	            file.read(bytes);
	            data = new String(bytes);

	            // print the modified data
	            System.out.println(data);

	            // close the file
	            file.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
