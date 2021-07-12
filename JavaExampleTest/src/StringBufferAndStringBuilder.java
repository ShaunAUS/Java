import java.util.Arrays;
import java.util.List;

public class StringBufferAndStringBuilder {
	public static void main(String[] args) {
		
		String str="hello";
		
		//stringbuffer 로 문자열 연결
		 StringBuffer stb=new StringBuffer(str);
		 stb.append("world").append("world2").append("world3");
		 
		 System.out.println(stb);
		
		 
		 //stringBuffer ->String으로 다시
		 String str2=stb.toString();
		 System.out.println(str2);
		 
		 
		//string.join()메서드로 문자열 연결
		 String str3=String.join("hi", "my name","is","minjae");
		 System.out.println(str3);
		 
		 //asList() 대신 Listof쓸수있다.// join(a.b)   a= 단어사이사이 구분자  b= 소스
		 List<String>list=List.of("JAVA","8","IS","GREAT");
		 String str4=String.join(" ", list);
		 System.out.println(str4);
	}
}
