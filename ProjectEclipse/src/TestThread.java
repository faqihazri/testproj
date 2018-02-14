
import java.time.LocalDateTime;



	public class TestThread implements Runnable {

	public static void main (String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + "  This is currently running on the main thread, " + 
		"this is the id: " + Thread.currentThread().getId());
		TestThread worker = new TestThread();
		Thread thread = new Thread(worker);
		thread.start();
		Thread t2 = new Thread(worker);
		t2.start();
		Thread t3 = new Thread(worker);
		t3.start();
		Thread t4 = new Thread(worker);
		t4.start();
		Thread t5 = new Thread(worker);
		t5.start();
		Thread t6 = new Thread(worker);
		t6.start();
		Thread t7 = new Thread(worker);
		t7.start();
		
		
		//Start threads
		ldt = LocalDateTime.now();
		System.out.println(ldt + "  Main thread finished running");
	}
	@Override
	public void run() {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + "  This is currently running on separate thread, " + 
				"this is the id: " + Thread.currentThread().getId() + ", with Name :" + Thread.currentThread().getName() + ", with priority :" + ThreadcurrentThread().getPriority());
	}
	private Thread ThreadcurrentThread() {
		// TODO Auto-generated method stub
		return null;
	}


	}

