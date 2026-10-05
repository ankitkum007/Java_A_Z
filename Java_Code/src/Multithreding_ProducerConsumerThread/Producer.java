package Multithreding_ProducerConsumerThread;

public class Producer extends Thread {
	Buffer buffer;
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for(int i=1; i<=5; i++) {
			buffer.produc(i);
		}
	}
}
