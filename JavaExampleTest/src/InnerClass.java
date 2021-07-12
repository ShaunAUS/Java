
public class InnerClass {
	
	public class Outer{
		
		private String outerField="outer";
		
		
		//내부클래스
		public class Inner{
			
			private String innerField="inner";
			
			public String innerMethod() {
				//내부에서 외부 변수,메서드 자유롭게 사용가능  내->외 그냥쓰기
				outerMethod();
				return outerField+innerField;
			}
		}
		
		
		//외부 메서드
		public void outerMethod() {
			
			//외->내 쓸때   내부인스만들고
			Inner inner=new Inner();
			
			System.out.println(inner.innerField);
			System.out.println(inner.innerMethod());
		}
		
		
		
		public static void main(String[] args) {
			//외부클래스에서 내부클래스 인스턴스만들떄// 외부 인스턴스로부터 내부인스턴스생성
			Outer out=new Outer();
			Inner inner=out.new Inner();
		}
		
		
		//static 내부클래스는 외부꺼 사용불가
		//static 은 일반 클래스처럼 인스턴스 생성하고 사용하기,  외부꺼 통해,외부인스턴스통해 xxxx
		
		//클래스 내부에서 인터페이스와 열거형은 암묵적 static이다
		
		
		
	}
	
	
}
