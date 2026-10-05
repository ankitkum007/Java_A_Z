package Multithreding_ProducerConsumerThread;

public class Consumer extends Thread{
	Buffer buffer;
	
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for(int i=1; i<=5; i++) {
			buffer.consum();
		}
	}

}
