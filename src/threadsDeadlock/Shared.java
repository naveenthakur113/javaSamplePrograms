package threadsDeadlock;

public class Shared {
	
	
	synchronized void operation1(Shared s2) {
		System.out.println("Inside operation 1");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		s2.operation2(this);
		
		System.out.println("Operation1 ends");
	}
	
	
	
	
	synchronized void operation2(Shared s1) {
		System.out.println("Inside operation 2");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s1.operation1(this);
		
		System.out.println("Operation2 ends");
	}

}
