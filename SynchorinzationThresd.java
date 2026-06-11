package telsuko.prac;
class Counter{
	
	private int count=0;
	
	public void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
	
}

public class SynchorinzationThresd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c=new Counter();
		
		Runnable obj1=()->{
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
		};
		
		Runnable obj2=()->{
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
		};
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			t2.join();
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(c.getCount());
	}

}
