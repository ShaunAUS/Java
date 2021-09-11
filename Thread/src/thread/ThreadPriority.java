package thread;

class ThreadTest{
	
	public static void main(String[] args) {
		
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority2 t2 = new ThreadPriority2();
		
		t2.setPriority(7);
		
		System.out.println("priority of th1(-):"+ t1.getPriority());
		System.out.println("priority of th2(+):"+ t2.getPriority());
		
		t1.start();
		t2.start();
		
	}

	
	public class ThreadPriority extends Thread{
		
		
	public void run() {
		
		for(int i=0; i <300; i++) {
			System.out.println("-");
			for(int x=0;x<1000000; x++);
		}
	}
	
	
	}
	
	
	public class ThreadPriority2 extends Thread{
		
		public void run() {
			
			for(int i=0; i <300; i++) {
				System.out.println("+");
				for(int x=0; x<1000000; x++);
			}
		}
	}
	
}




