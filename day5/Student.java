package IOstreams;

public class Student {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public Student(String name, boolean gender, int age, float grade) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.grade = grade;
	}

	private String name;
	private boolean gender;
	private int age;
	private float grade;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
