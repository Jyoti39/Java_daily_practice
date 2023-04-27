package JavaThreads;


class Parent{
	public void m1() {
		System.out.println("This is m1 methods");
	}
}
//creating thread class by using thread method
class T1 extends Thread{
	public void run() {
		System.out.println("By thread class");
	}
}
//craeting thread class by using runnable method
class T2 extends Parent implements Runnable{
	public void run() {
		m1();
		System.out.println("By using runnable interface");
	}
}
public class ThreadConcept {
	public static void main(String[] args) {
		T1 t1= new T1();
		t1.start();
		T2 t2=new T2();
		Thread trd= new Thread(t2);
		trd.start();

	}

}
