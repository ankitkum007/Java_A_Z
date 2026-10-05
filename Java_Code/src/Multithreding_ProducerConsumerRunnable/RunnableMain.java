package Multithreding_ProducerConsumerRunnable;

public class RunnableMain {

	public static void main(String[] args) {
		RunnableBuffer buffer = new RunnableBuffer();

		RunnableProducer producer = new RunnableProducer(buffer);
		RunnableConsumer consumer = new RunnableConsumer(buffer);

		Thread p = new Thread(producer);
		Thread c = new Thread(consumer);

//		Thread p = new Thread(new RunnableProducer(buffer));
//		Thread c = new Thread(new RunnableConsumer(buffer));
		p.start();
		c.start();
	}

}
