package Multithreding_ProducerConsumerRunnable;

public class RunnableProducer implements Runnable{
	RunnableBuffer buffer;
	
	public RunnableProducer(RunnableBuffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for(int i=1; i<10; i++) {
			buffer.producer(i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException  e) {
				e.printStackTrace();
			}
		}
	}

}
