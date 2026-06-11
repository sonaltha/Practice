package telsuko.prac;
class sleep extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+ " Working thread no " +i);
			
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(" The thread is interrupted");
			}
		}
		
	}
}

public class ThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sleep t1=new sleep();
		sleep t2=new sleep();
		
		t1.setName("Alpha");
		t2.setName("Beta");
		
		t1.start();
		t2.start();
	}

}
