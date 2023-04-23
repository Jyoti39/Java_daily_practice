package WileyProject;
 class Gadi{
void run()
{
	System.out.println("Vehicle is moving");  
} 
}
  
class Bike extends Gadi{  
  //defining the same method as in the parent class  
  void run(){
	  System.out.println("Bike is running safely");}
  }

public class MethodOverriding {
	public static void main(String[] args) {
		Bike obj = new Bike();//creating object  
		  obj.run();
		
		  
	}

}
