package threads;

public class Task1 extends Thread {

	public void run() {
		System.out.println("Task1 has started");
		for (int i = 101; i <= 120; i++) {
			System.out.println("Printer1 -- doc#" + i);
		}
		System.out.println("Task1 has completed");
	}

}
