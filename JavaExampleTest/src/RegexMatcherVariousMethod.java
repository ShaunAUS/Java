import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcherVariousMethod {
	public static void main(String[] args) {
		
		
		
		//replaceFirst()  처음 찾은거 치환
		String str="레시피";
		
		
		Pattern p =Pattern.compile("Recipe.");
		Matcher m =p.matcher("Java Recipe has many Recipe!!");
		
		String result=m.replaceFirst(str);
		System.out.println(result);
		
		//이동한 matcher의 시퀀스를 리셋
		m.reset();
		
		String result2=m.replaceAll(str);
		System.out.println(result2);
		
		m.reset();
		
		
		//appendReplacement(a,b)    b로치환해 a스트링버퍼에 저장 //find와 같이쓰임
		StringBuffer replacedString=new StringBuffer();
		while(m.find()) {
			m.appendReplacement(replacedString,str);
		}
		//find 마지막 검색 이후 나머지 문자열들 결합
		StringBuffer result3=m.appendTail(replacedString);
		System.out.println(result3);
		
		
		//String 클래스만으로 정규표현 사용    $0 = 일치한 문자열 전체  ,$1$2 정규표현 그룹
		
	String result4= m.replaceAll("Recipe","$0 is shit");
		
		
	}
}
