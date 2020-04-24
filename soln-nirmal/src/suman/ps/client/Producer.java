package suman.ps.client;

public class Producer extends Thread {
	
	@Override
	public void run() {
		System.out.println("Producer call from the thread");
	}

}
