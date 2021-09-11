package thread;



//- 3초마다 변수 autoSave의 값을 확인해서 그값이 true 이면 autoSave()를 호출하는 일을 무한히 반복하는 쓰레드이다.
//메인 메서드에서 데몬 쓰레드를 만들고 start() 로 호출스택에 쓰레드를 생성한뒤 main은 main끼리  
//데몬 쓰레드는 자기들끼리 진행된다.
public class Daemon  implements Runnable{

	static boolean autoSave=false;
	
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(3*1000); //3초마다  autoSave true인지 체크
			} catch (InterruptedException e) {
				
				
			}
			
			if(autoSave) {
				autoSave();
			}
		}
		
	}
	
	private void autoSave() {
		
		System.out.println("작업파일이 자동 저장 되었습니다.");
	}


	
	
	public static void main(String[] args) {
		
		Thread t= new Thread(new Daemon());
		t.setDaemon(true);    // 이부분이 없으면 종료되지 않는다.
		t.start();   // 호출 스택에 데몬 쓰레드 시작.
		
		
		//메인 쓰레드 시작
		for(int i= 1; i<=10 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(i);
				
				if(i==5) {
					autoSave=true;
				}
			}
		}
	}
	
}
