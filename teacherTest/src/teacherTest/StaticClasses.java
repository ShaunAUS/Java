package teacherTest;

public class StaticClasses {
	
	//내부 static 클래스
	static class Inner1{
		
		static final String greet="안녕";
		static void sayHello() {
			System.out.println(greet);
		}
	}
	
	class Inner2{
		String greet="Hello";
		void sayHello() {
			System.out.println(greet);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		//외부 클래스 생성
		StaticClasses sc = new StaticClasses();
		
		StaticClasses.Inner1 si1= new StaticClasses.Inner1();
		si1.sayHello();
		
		StaticClasses.Inner2 si2=sc.new Inner2();
		si2.sayHello();
	}
}
