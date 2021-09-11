package thread;


// thread 클래스 구현

/*public class Test1 extends Thread{
	
	public void run() {
		
		// 조상인 thread getName() 바로 호출 가능
		for(int i =0; i<5; i++) {
			System.out.println(getName());
			
		}
	}

}*/



// Runnable 인터페이스 구현

 public class Test1 implements Runnable{
 
 public void run(){
	 
	 //메서드 위치 직접 써야함
	 for(int i =0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	 
	 
  }
 
 
 
 public static void main(String[] args) {
	
	 Runnable r= new Test1();   //Runnalbe 인터페이스 구현한 클래스의 인스턴스 생성
	 Thread t1 = new Thread(r); // 생성자 Thread  //Runnalbe 인터페이스 구현한 클래스 인스턴스 매개변수로
	 
	 t1.start();
}
 
  }
 


