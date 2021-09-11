package thread;

import thread.ThreadJoinMethod.ThreadJoinMethod2;

class ThreadTest1{
	
	static long startTime = 0;
	
	public static void main(String[] args) {
		
		ThreadJoinMethod th1 = new ThreadJoinMethod();
		ThreadJoinMethod2 th2 = new ThreadJoinMethod2();
		
		th1.start();
		th2.start();
		startTime =System.currentTimeMillis();
		
		th1.join();  // main쓰레드가 th1의 작업이 끝날떄까지 기다린다
		th2.join();  // main쓰레드가 th2의 작업이 끝날떄까지 기다린다
		
	}
}



public class ThreadJoinMethod extends Thread {
	
	public void run() {
		
		for(int i=0; i<300 ; i++) {
			
			System.out.println(new String("-"));
		}
	}// run 끝
	
	
	public class ThreadJoinMethod2 extends Thread {
		
		public void run() {
			
			for(int i=0; i<300 ; i++) {
				
				System.out.println(new String("+"));
			}
		}// run 끝
	

}
