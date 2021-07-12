import java.util.Optional;

public class Test9 {
	
	//optional
	//null 가능성이 있는것을 optional 객체에 넣어서 null 예외 방지
	
	public static void main(String[] args) {
		
		
			String arr= "abc";
			
			
			
			Optional<String> opt= Optional.of(arr);   					 //null 이면 예외 발생
			Optional<String> opt2 =Optional.ofNullable(null);			//null  // null 이여도 예외 발생 x// optional 객체에 넣기
			Optional<String> opt3=Optional.empty(); 					// 값을 갖지 않는 빈 optional 객체 만듬
			
			
			//String s1= opt2.get();  									 //null값 //예외 발생
			String s2= opt2.orElse("예외발생하면 대체값");  					//null값
			System.out.println(s2);
			
			
			if(opt2.isPresent()) {										//null 이아니면 실행  null이면 실행x
				System.out.println("값이 있으면 실행");
				
			}
			
			opt2.ifPresent(null);										//값이 있으면 람다식 실행
			
	}
}
