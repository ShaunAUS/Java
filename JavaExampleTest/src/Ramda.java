import java.util.Arrays;
import java.util.List;

public class Ramda {
	public static void main(String[] args) {
		
		
		List<String> list=Arrays.asList("Java","Scale","Groovy");
		
		//java 7
		for(String result:list) {
			System.out.println(result);
		}
		
		//java 8 // list 도 foreach 가능
		
		list.forEach(s->System.out.println(s));
		
		list.sort("람다식");
		
	}
}
