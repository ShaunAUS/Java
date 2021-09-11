package thread;

public class ThreadExceptioion extends Thread {
		
	
	public void run() {
		throwException();
		
	}
	
	

	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		ThreadExceptioion t1= new ThreadExceptioion();
		t1.run();
		
	}
}
	

