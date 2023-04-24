package WileyProject;
abstract class Vehicle{
	protected String color;
	protected int speed;
	protected int numWheels;
	public Vehicle(String color,int speed,int numWheels) {
		this.color=color;
		this.speed=speed;
		this.numWheels=numWheels;
	}
	public abstract void move();
}
class Cars extends Vehicle{

	public Cars(String color, int speed, int numWheels) {
		super(color, speed, numWheels);
		// TODO Auto-generated constructor stub
	}
	
}
public class CarAbstract {
	public static void main(String[] args) {
		
	}

}
