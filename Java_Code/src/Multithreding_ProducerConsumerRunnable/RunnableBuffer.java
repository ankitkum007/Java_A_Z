package Multithreding_ProducerConsumerRunnable;

public class RunnableBuffer {
	private int item;
	private boolean avialable = false;
	
	public synchronized void producer(int value) {
		while(avialable) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		item = value;
		avialable = true;
		System.out.println("Produed: " + item);
		notify();
	}
	
	public synchronized void consumer() {
		while(!avialable) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumed: " + item);
		avialable = false;
		notify();
	}

}
