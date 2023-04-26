package IOstreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class CharacterStreamsClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          /* Writer out=new OutputStreamWriter(System.out);
           Writer fw=new FileWriter("E:\\data\\data4.txt");
           BufferedWriter bw=new BufferedWriter(fw);
           bw.write("I Like program I don't have any option");
           bw.flush();
           bw.close();
           fw.close();*/
		
		 Reader out=new InputStreamReader(System.in);
         Reader fw=new FileReader("E:\\data\\data4.txt");
         BufferedReader bw=new BufferedReader(fw);
         int i=0;
     	while((i=out.read())!=-1) {
     		System.out.println((char)i);

     }
     	fw.close();
     	bw.close();
	}

}
