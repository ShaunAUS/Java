import java.util.Optional;

public class Test10 {
	public static void main(String[] args) {
		
		//optional 도 stram 처럼 중간연산 사용 가능!!
		String str= null;
		String str2= null;
		Optional<String> opt= Optional.ofNullable(str);
		
		opt.filter(null).ifPresent(null);    //optional 과 filter메서드 같이 쓰기 // optional 값이 특정 조건 만족할때만
		
		
		
		Optional<String> opt2 = Optional.ofNullable(st2);
		Optional<String> op2Mapped= opt2.map(null);    //opt2 요소를 map을 이용해 바꾸고  ★새로운 optional 생성
																//flatmap() 은 그냥 optiona  반환 		
		
		// filter, map 둘다 null 일경우  빈 optional 반환
	}
}
