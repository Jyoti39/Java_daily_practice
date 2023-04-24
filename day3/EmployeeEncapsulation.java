package WileyProject;
class Employee{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name=name;
		}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
	class EmployeeImpl{
		public void show (Employee emp) {
			System.out.println("calling Show method");
			System.out.println("Name: " +emp.getName()+ " age: " +emp.getAge());
		
	}
	}

public class EmployeeEncapsulation {

	public static void main(String[] args) {
		
	 
		// TODO Auto-generated method stub
     Employee emp=new Employee();
     emp.setName("Wiley");
     emp.setAge(15);
     //System.out.println("Name: " +emp.getName()+ " age: " +emp.getAge());
     EmployeeImpl eimpl=new EmployeeImpl();
     eimpl.show(emp);
     
	}

}
