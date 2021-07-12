import java.util.Optional;

public class Test21 {
	
	
	public static void main(String[] args) {
		
		
		//null가능성이 있으면 optional 객체에 넣어서 관리
		String str="abc";
		
		
		
		//옵셔널 객체 만들기
		Optional<String> opt=Optional.ofNullable(str);
		
		
		//옵셔널 객체 꺼내기//널이면 yes 나온다.
		
		String value=opt.orElse("yes");
		System.out.println(value);
		
		
		//객체꺼내기 //널이면 null대신 람다식이 나온다
		String Value2=opt.orElseGet(null);
		
		
		//null이면 false
		if(opt.isPresent()) {
			System.out.println("optional opt는 null이 아닙니다");
		}
		
		//객체 꺼내기// 널이면 null값 대신 람다식 실행
		opt.ifPresent(null);
		
		// filter(), map(), flatmap() 사용가능 
				
	}
	
	
	
}
