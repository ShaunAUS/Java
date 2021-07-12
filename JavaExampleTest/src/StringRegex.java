import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {
	public static void main(String[] args) {
		
		//정규 표현//조건
		Pattern p =Pattern.compile(".*many.*");
		
		//matcher 객체 구현 // 소스
		Matcher m =p.matcher("Java Recipe has many Recipes");
		
		
		//문자열이 정규표현에 맞나 확인
		//find, mathces = boolean 값만,   매치하는 값은= group()
		boolean result= m.matches();  
		System.out.println(result);
		
		
		//확인 2번째 방법
		boolean result2=p.matches(".*many.*","Java Recipe has many Recipes");
		System.out.println(result2);
	}
}
