
public class Test8 {
	public static void main(String[] args) {
		
		
		
		//항상 널체크
		String str="abc";
		String str2="bbb";
		if(str!=null&& str.equals("JAVA")) {
			System.out.println("success");
		}
	
	
		if("JAVA".equals(str2)){				//리터럴.equals() 하면 null exception 체크 안해도 ㄱㅊ
		System.out.println("실행문");
	}
	}
}

