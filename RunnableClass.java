package telsuko.prac;

public class RunnableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable obj1=()->{
			for(int i=1;i<=6;i++) {
				System.out.println("hi "+i);
				
				try {
					Thread.sleep(500);
				}catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("guess what some one has interrupted");
				}
			}
		};
		Runnable obj2=()->{
			for(int i=1;i<=6;i++) {
				System.out.println("Hello " +i);
				
				try {
					Thread.sleep(500);
				}catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("guess what some one has interrupted");
				}
			}
		};
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();

	}

}
