package threads;

public class Task2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task2 has started");
		for(int i=121;i<=140;i++) {
			System.out.println("Printer2 -- doc#"+i);
		}
		System.out.println("Task2 has completed");
	}

}
