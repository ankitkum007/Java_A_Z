package Multithreding_ProducerConsumerThread;

public class Main {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		Producer p = new Producer(buffer);
		Consumer c = new Consumer(buffer);
		
		p.start();
		c.start();
	}
}
