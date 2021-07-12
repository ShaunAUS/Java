
public class AnnonymousAndIntializer {
		
	//익명클래스는 생성자가 없다. but 초기화블럭(이니셜라이저)를 통해 초기화 가능
	Runabble r=new Runabble() {
		
		{
			
			//초기화블럭(이니셜라이져
		}
		
		
		
		
		
		@Override
		public void run() {
			System.out.println("");
		}
		
		
	}
	
}
