import java.awt.List;

public class Test19 {
	public static void main(String[] args) {
		
		int i = 1;
		List<Integer> list=new List<>();
		
		list.add(i);
		
		//인덱스 요소를 삭제 // 인덱스 요소를 삭제 몇번쨰
		list.remove(i);   list.remove(i);
		//객체 자체를 삭제// 객체 자체를 삭제 
		list.remove(new Integer(i));   list.remove(new Integer(1));
		
		
		
		
		String str=null;
		
		//str null인지 확인
		if(str!=null &&str.equals("Java")) {
			//실행문
		}
		
		//문자열 리터럴 equals() 메소드 호출하면 null확인 x // 보통은 변수.equals(변수)// 이건 문자열리터럴.equals(변수)
		if("JAVA".equals(str)) {
			//실행문
		}
		
		
	}
}
