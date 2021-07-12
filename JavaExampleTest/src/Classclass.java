import java.lang.reflect.Method;

public class Classclass {
		
	
	
	public static void main(String[] args) {
		
		//class 인스턴스를 구한다  = 클래스이름.class   				//클래스 이름을로 구하기
		Class<Exception> e= Exception.class;
		
		//인스턴스에서 class인스턴스 구하기 = getClass()  				//인스턴스에서 구하기
		Exception instance=new Exception();
		Class<? extends Exception> e= instance.getClass();
		
		//class.forName(클래스이름)								//클래스 이름으로 구하기
		Class<?> ex=Class.forName("java.lang.Exception");

		
		
		
		Class<Runnable> c=Runnable.class;
		
		System.out.println(c.isInterface());
		System.out.println(c.isAnonymousClass());
		System.out.println(c.isEnum());
		
		
		
		//리플렉션= Class객체로부터 필드나 메서드 등의 정보를 받을수 있고 그것들을 동적으로 호출하는것
		
		//Class로 클레스 부르고
		Class<?> clazz=obj.getClass();
		//메서드를 얻는다   getMethod(메서드 이름,인수타입)
		Method method=clazz.getMethod("setNmae, String.class");
		//invoke(클래스이름,인수)  // 메서드 호출
		method.invoke(obj, "Nice");
	}
}
