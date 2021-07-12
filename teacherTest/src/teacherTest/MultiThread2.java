package teacherTest;

public class MultiThread2 extends Thread {
	
	
	int time;
	
	MultiThread2(String str, int t){
		super(str);
		time=t;
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("no"+i+":"+Thread.currentThread().getName());
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MultiThread2 a = new MultiThread2("A",500);
		MultiThread2 b = new MultiThread2("\tB",700);
		MultiThread2 c = new MultiThread2("\t\tC",1100);

		a.start();
		b.start();
		c.start();
	}
}
