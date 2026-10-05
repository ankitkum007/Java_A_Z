package Multithreding_ProducerConsumerThread;

public class Buffer {
	private int item;
	private boolean available = false;
	
	public synchronized void produc(int value) {
		while(available) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		item = value;
		available = true;
		System.out.println("Produced " + item);
		notify();
	}
	
	public synchronized void consum() {
		while(!available) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumed " + item);
		available = false;
		notify();
		
	}
}
