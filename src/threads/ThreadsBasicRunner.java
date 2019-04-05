package threads;

public class ThreadsBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Task1 task1=new Task1();	
		Runnable task2 = new Task2();
		Thread task2Thread = new Thread(task2) ;
		
		task1.start();		
		task2Thread.start();
	//	task2Thread.setPriority(10);
	//	task1.setPriority(1);
		
		
		//task1.join();
		//task2Thread.join();
		
		System.out.println("Task3 has started");
		
		for(int i=141;i<=160;i++) {
			System.out.println("Printer3 -- doc#"+i);			
		}
		
		System.out.println("Task3 has completed");
	}

}
