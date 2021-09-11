package thread;
//쓰레드 메서드  -sleep()

class ThreadExTest{
	
	
	public static void main(String[] args) {
		ThreadEx th1 = new ThreadEx();
		ThreadEx2 th2= new ThreadEx2();
		
		th1.start();
		th2.start();
		
		try {
			th1.sleep(2000);
		} catch (InterruptedException e) {
			
			System.out.println("<<main 종료>>");
		}//main 끝
	}
}


//쓰레드 1
public class ThreadEx extends Thread  {
  
	 public void run() {
		 
		 for(int i= 0; i<300 ; i++) {
			System.out.println("-");
		 }
		 System.out.println("<<th1 종료>>");
	 }
	 
	 
}

//쓰레드 2
class ThreadEx2 extends Thread{
	

	 public void run() {
		 
		 for(int i= 0; i<300 ; i++) {
			System.out.println("-");
		 }
		 System.out.println("<<th2 종료>>");
	 }
	
	
}
