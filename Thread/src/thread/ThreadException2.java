package thread;

public class ThreadException2 extends Thread{
	
	
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
		
		
		public static void main(String[] args) throws Exception{
			
			ThreadException2 t1 = new ThreadException2();
			t1.run();
			
		}
	}

