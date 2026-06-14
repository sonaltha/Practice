package telsuko.prac;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerThread {

	public static void main(String[]args) {
		
		BlockingQueue<Integer>buffer=new ArrayBlockingQueue<Integer>(5);
		
		Thread producer=new Thread(()->{
			try {
				for(int i=1;i<10;i++) {
					buffer.put(i);
					System.out.println("PRoduced " +i);
					Thread.sleep(500);
				}
			}
			catch(InterruptedException e) {
              Thread.currentThread().interrupt();				
			}
		});
		
		Thread consumer=new Thread(()->{
			try {
				for(int i=1;i<10;i++) {
					Integer value=buffer.take();
					System.out.println("Consumer " +i);
					Thread.sleep(550);
				}
			}
			catch(InterruptedException e) {
	              Thread.currentThread().interrupt();				
				}
			
		});
		
		producer.start();
		consumer.start();
	}
}
