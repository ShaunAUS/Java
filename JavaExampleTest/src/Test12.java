
public class Test12 {

	public static void main(String[] args) {
		
		
	//str 이 null 이면 예외발생, null체크
	//문자열 항상 null체크!!!
		
		
	String str="arr"; 
	
	
	if(str==null) {
		System.out.println("str 이 null 입니다");  //null처리
	}else {
		switch(str) {
		
		
		case "spring":System.out.println("null이 아닙니다");
		}
	}
	}

}
