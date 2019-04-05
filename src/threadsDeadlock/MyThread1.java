package threadsDeadlock;

public class MyThread1 extends Thread {
	private Shared s;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		s.operation1(s);
	}

	public MyThread1(Shared s) {
		this.s = s;
	}

}
