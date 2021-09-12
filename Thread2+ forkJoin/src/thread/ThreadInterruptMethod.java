package thread;

import javax.swing.JOptionPane;

// 쓰레드 interrupt 메서드
class ThreadTest{
	
	public static void main(String[] args) {
		
		ThreadInterruptMethod th1= new ThreadInterruptMethod();
		th1.start();    // 쓰레드 호출 스택 만듬
		
		String input= JOptionPane.showInputDialog("아무값 입력");
		System.out.println("입력하신 값은" + input+"입니다");
		
		th1.interrupt(); // interrupt 를 호출하면 interrupted상태가 true 가된다!!
		System.out.println("isInterrupted():" + th1.isInterrupted());    // true 반환 
		
	}
	
}


public class ThreadInterruptMethod extends Thread{
	
	public void run() {
		 
		 int i =10;
		 
		 while(i!=0 &&!isInterrupted()) {
			 System.out.println(i--);
			 for(long x=0; x>2500000000L; x++); //시간 지연
			 
		 }
		 System.out.println("카운트 종료");
	 }
	 

}
