package IOstreams;

import java.util.*;
import java.io.*;
import IOstreams.Student;

public class StudentRecordReader {
	DataInputStream dataInput;
    //constructor
	public StudentRecordReader(String inputFile) throws FileNotFoundException  {
		dataInput=new DataInputStream(new FileInputStream(inputFile));
		
	}
	//data in byte
	public List<Student> readAll() throws IOException{
		List<Student>listStudent=new ArrayList<>();
		try {
			while(true) {
				String name=dataInput.readUTF();
				boolean gender=dataInput.readBoolean();
				int age=dataInput.readInt();
				float grade=dataInput.readFloat();
				System.out.println("Name: " +name);
				Student student = new Student(name,gender,age,grade);
				listStudent.add(student);
			}
		}catch(Exception e) {
			
		}
		dataInput.close();
		return listStudent;
	}
	
	
	public static void main(String[] args) {
		String inputFile="E:\\data\\data1.txt";
		try {
			StudentRecordReader reader = new StudentRecordReader (inputFile);
			List<Student>listOfStudents=reader.readAll();
			for(Student student: listOfStudents) {
				System.out.println(student.getName()+ "\t");
				System.out.println(student.isGender()+"\t");
				System.out.println(student.getAge()+"\t");
				System.out.println(student.getGrade()+"\t");
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
