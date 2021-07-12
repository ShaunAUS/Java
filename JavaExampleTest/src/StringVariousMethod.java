import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringVariousMethod {
	
	
	public static void main(String[] args) {
		
		//getByte
				String str="안녕";
				try {
					int a=str.getBytes("UTF-8").length;
					System.out.println(a);
				} catch (UnsupportedEncodingException e) {
					
					e.printStackTrace();
				}
		
		//subString()
		String str2= "안 녕하세요";
		String result=str2.substring(3);	     //지정한 인덱스부터 끝까지
		String result2=str2.substring(1,4);		//첫쨰 인덱스부터 마지막(미포함)인덱스까지
		
		
		System.out.println(result);
		System.out.println(result2);
		
		
		//split(a,b)     a=구분자 b=배열의 최대 인수값,b값만큼 나누겠다.
		//b 0이면 최대수 제한 없다 = 하나씩 나눈다 , b값 -이면 최대수 제한없고, 빈문자열도 배열에 포함
		String str3="A,B,C";
		String[] result1=str3.split(",", 0);
		System.out.println(result1);
		
		
		//equals() 대소문자 구분 x버전 
		String str4="HelloWorld";
		boolean result4=str4.equalsIgnoreCase("helloworld");
		System.out.println(result4);
		
		
		
		//replace()  첫번쨰 인수를 두번쨰인수로 바꾼다
		
		String str5= "ffffather";
		String result5=str5.replace("f", "m");
		System.out.println(result5);
		
		//startsWith()   인수(값)으로 시작하는지 확인  <-> endswith();
		String str6="mother";
		boolean result6=str6.startsWith("mo");
		System.out.println(result6);
		
		
		//indexOf()  문자열중에서 해당 값 검색해서 처음찾은 문자열의 인덱스값
		//두번쨰 인수는 그 인덱스 이후 값 검색, ("hi,7)= 8문자짜이후 hi찾기
		//문자열 찾기 = 인덱스로 반환
		
		String str7="hellow world hi my name is";
		int result7=str7.indexOf("hi");
		System.out.println(result7);
		
		
		
		
		//문자열 문자 코드 변환 1. getByte()  //예외처리 필수
		try {
			byte[] bytes="안녕 세계".getBytes("UTF8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
		//2,Charset.forName()
		Charset cs=Charset.forName("UTF-8");
		byte[]bytes2="안녕 세계".getBytes(cs);
		
		//3, StandardCharSet 사용  // standard 사용해야 오류가없다~~예외처리없다~~
		byte[]bytes3="안녕 세계".getBytes(StandardCharsets.UTF_8);
	}
}
