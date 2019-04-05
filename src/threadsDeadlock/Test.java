package threadsDeadlock;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyThread1 thread1=new MyThread1(new Shared());
		thread1.start();
		MyThread2 thread2=new MyThread2(new Shared());
		thread2.start();
	}

}
