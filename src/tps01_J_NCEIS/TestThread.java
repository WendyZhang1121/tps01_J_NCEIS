package tps01_J_NCEIS;

import java.util.concurrent.ExecutionException;

public class TestThread implements Runnable {

	public void run() {	
		ValidationService test = new ValidationService((int)(Math.random()*9+1));
		try {
			test.fieldAggregator("test");
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
	}
	public static void main(String[] args) throws Exception { 
		
		TestThread t = new TestThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
