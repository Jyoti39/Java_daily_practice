package JavaThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyWeddingcard extends Thread{
	public void run() {
		System.out.println("Thread Name: " +Thread.currentThread().getName());
		
	}
}
public class WeddingCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	ExecutorService executor =Executors.newFixedThreadPool(4);
		ExecutorService executor =Executors.newCachedThreadPool();
		for(int i=1;i<=100;i++) {
			executor.execute( new MyWeddingcard());
		}
		
	}

}
