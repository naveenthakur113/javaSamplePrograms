package threadsDeadlock;

public class MyThread2 extends Thread {
	private Shared s;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		s.operation2(s);
	}

	public MyThread2(Shared s) {
		this.s = s;
	}

}
