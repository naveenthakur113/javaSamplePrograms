package threads;

public class App {
	
	
	//main method represents main thread
	public static void main(String[] args) {
		
		//the instructions written here will be executed by main thread
		//Threads always execute the jobs in a sequence
		
		System.out.println("--Application started--");
		
		
		for(int doc=1;doc<=10;doc++) {
			System.out.println("Printing document #"+ doc);
		}
		
		
		System.out.println("--Application execution has completed--");
		
	}

}
