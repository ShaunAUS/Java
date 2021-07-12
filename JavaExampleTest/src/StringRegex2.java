import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex2 {
	
	//matcher.group()= (매칭된 부분) 문자열로 구할수있다.
	public static void main(String[] args) {
		
		Pattern p =Pattern.compile("Recipe");
		Matcher m =p.matcher("java Recipe has many Recipe");
		
		
		
		/*
		while(m.find()) {		//찾기 // boolean    //찾고 group 에 string으로 넣는다
			String group=m.group();//매칭된부분 문자열로 반환
			System.out.println(group); //매칭된부분 반환
		}
		*/
		
		
		
		
		//group(int i)  i번쨰 매치된부분 출력,   0는 전체 출력
		
		if(m.find()) {
			System.out.println(m.group(0));                      
			System.out.println("정규식에 매치한 첫번째 값"+m.group(1));
			System.out.println("정규식에 매치한 첫번째 값"+m.group(2));
			
		};
	}
}
