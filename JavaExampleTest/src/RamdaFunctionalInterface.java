import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class RamdaFunctionalInterface {
	
		//자체적으로 함수형 인터페이스 만들기
			@FunctionalInterface
			public interface TriFunction{
				public int apply(int a,int b, int c);
			}
	
			
			
	public static void main(String[] args)
	{
		//함수형 인터페이스 람다식// 인수값 하나 리턴값 하나// 자료형 똑같음
		UnaryOperator<String> toUpper= s->s.toUpperCase();
		String str=toUpper.apply("this");
		System.out.println(str);
		
		
		//함수형 인터페이스 람다식//인수값 하나// 리턴값 없다
		Consumer<Date> print = date->{ 
			String str2=new SimpleDateFormat("yyyy/mm/dd").format(date);
			System.out.println(str2);
			
			print.accept(new Date());
		};
		
		
		//함수형인터페이스 람다식//인수값 하나// 반환 boolean
		
		Predicate<String> condition = s->s.startsWith("java");
		boolean result= condition.test("javaScript");
		System.out.println(result);
		
		//자체적으로 만든 함수인터페이스
		TriFunction function=(a,b,c)->(a+b+c);
		
		
		//람다식을 메서드 매개변수로 쓸수있다
	}
}
