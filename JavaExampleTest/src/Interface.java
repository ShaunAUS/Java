
public class Interface implements Hello {

	@Override
	public void Method() {
		System.out.println("인터페이스메서드 오버라이딩");
		
	}
	
	//메인
	public static void main(String[] args) {
		new Interface().Method();
		new Interface().Method2();
	}
}
