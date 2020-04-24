package suman.ps.client;

public class Consumer extends Thread {
	
	@Override
	public void run() {
		System.out.println("Consumer call from the thread");
	}
	
}
