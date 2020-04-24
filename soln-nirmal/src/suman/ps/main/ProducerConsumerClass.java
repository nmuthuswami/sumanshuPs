package suman.ps.main;

import suman.ps.client.Consumer;
import suman.ps.client.Producer;

public class ProducerConsumerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Program starts");
		Producer pr = new Producer();
		pr.start();
		
		Consumer cs = new Consumer();
		cs.start();
		System.out.println("Main Program ends");
		
	}

}
