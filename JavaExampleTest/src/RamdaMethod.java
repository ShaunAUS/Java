import java.util.Arrays;
import java.util.List;

public class RamdaMethod {
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("java","Scala","Groovy");
		
		
	//람다식으로 기술한 경우
		list.forEach((s)->System.out.println(s));
	
		
	//메서드 참조형
		list.forEach(System.out::println);
	}
}
