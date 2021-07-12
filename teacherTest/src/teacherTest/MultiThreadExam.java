package teacherTest;

public class MultiThreadExam extends Thread{
		String str;
		int time;
		
		MultiThreadExam(String s, int t){
			str=s;
			time=t;
		}
		
		public void run() {
			for(int i =0; i <5; i++) {
				System.out.println("no"+i+":"+str);
				try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		public static void main(String[] args) {
			MultiThreadExam a = new MultiThreadExam("A",500);
			MultiThreadExam b = new MultiThreadExam("\tB",700);
			MultiThreadExam c = new MultiThreadExam("\t\tC",1100);

			a.start();
			b.start();
			c.start();
		}
}
