package Multithreding_ProducerConsumerRunnable;

public class RunnableConsumer implements Runnable {
	RunnableBuffer buffer;
	
	public RunnableConsumer(RunnableBuffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for(int i=1; i<10; i++) {
			buffer.consumer();
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
