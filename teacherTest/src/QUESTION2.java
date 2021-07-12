import java.util.HashSet;

public class QUESTION2 {
	
	public static void main(String[] args) {
		HashSet<String> set= new HashSet();
		
		set.add("사과");
		set.add("오렌지");
		set.add("바나나");
		set.add("포도");
		
		
		set.remove("오렌지");
		
		System.out.println(set);
		
		if(set.contains("바나나")){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
		if(set.contains("오렌지")) {
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}
		
	}
}
