package WileyProject;
class Animal{
	public void eat() {
		System.out.println("Eat");
	}
	public void sleep() {
		System.out.println("Sleep");
	}
    
}
class Lion extends Animal{
	public void roar() {
		System.out.println("Lion is roaring");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Lion lion=new Lion();
		lion.roar();
		lion.eat();
		lion.sleep();
		
	}

}
