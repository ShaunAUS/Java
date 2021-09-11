package thread;


class ThreadTest33{
	
	public static void main(String[] args) {
		
		ThreadYieldMethod th1 = new ThreadYieldMethod("*");
		ThreadYieldMethod th2 = new ThreadYieldMethod("**");
		ThreadYieldMethod th3 = new ThreadYieldMethod("***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(2000);
			th1.resume();
			Thread.sleep(2000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {
			
		}
	}
}
public class ThreadYieldMethod implements Runnable{
	
	boolean suspended = false;
	boolean stopped = false;
	
	Thread th;
	
	
	
	
	public ThreadYieldMethod(String name) {
		th = new Thread(this, name);  //Thread(Runnable r, String name)
	}

	public void run() {
		
		String name= th.getName();
		
		while(!stopped) {
			if(!suspended) {
				System.out.println(name);
				
				
				try {
					Thread.sleep(1000);   // 쓰레드 멈추기
				} catch (InterruptedException e) {
					
					System.out.println(name + " - interrupted");
				}
				
			}else {
				Thread.yield();  // 양보, 이부분이 없다면// suspended 가 ture 이면 쓸데 없이 while문만도는 busy wating 발생
			}
		}
		System.out.println(name+"-stopped");
	}
	
	
	public void suspend() {
		
		suspended=true;
		th.interrupt();
		System.out.println(th.getName()+"-interrupt() by suspend()");
		
	}
	
	public void stop() {
		
		stopped = true;
		th.interrupt();
		System.out.println(th.getName()+"-interrupt()by stop()");
	}
	
	public void resume() {suspended= false;}
	public void start() {th.start();}
	
}
