package q1;

public class DeadLock {
	
	public static Object lock1=new Object();
	
	public static Object lock2=new Object();
	
	public static void main(String[] args) {
		ThreadOne threadOne1 = new ThreadOne(lock1,lock2);
		ThreadTwo threadTwo = new ThreadTwo(lock1,lock2);
		
		threadOne1.start();
		threadTwo.start();
	}
}
	
 class ThreadOne extends Thread{
		
		private Object lock1;
		private Object lock2;
		
		
		public ThreadOne(Object lock1, Object lock2) {
			super();
			this.lock1 = lock1;
			this.lock2 = lock2;
		} 


		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Started Executing Thread 1");
			
			synchronized (lock1) {
				System.out.println("Thread 1 holding lock 1...");
			
				
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}	
			
			System.out.println("THread 1 awit from the lock2");
			
			synchronized (lock2) {
			
				System.out.println("thred1 is holding lock 1 & lock 2");
			}
				
				
			}
			
		}

}
 class ThreadTwo extends Thread{
	 private Object lock1;
		private Object lock2;
		
		
		public ThreadTwo(Object lock1, Object lock2) {
			super();
			this.lock1 = lock1;
			this.lock2 = lock2;
		}


		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Started Executing Thread 2");
			
			synchronized (lock1) {
				synchronized (lock2) {
				System.out.println("Thread 2 holding lock 1...");
			
				
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}	
			
			System.out.println("THread 2 awit from the lock2");
			
			
			
				System.out.println("thred2 is holding lock 1 & lock 2");
			}
				
				
			}
			
		}

}	
	
