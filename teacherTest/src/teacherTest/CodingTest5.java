package teacherTest;

public class CodingTest5 {
	
	static String s=null;
	

	public static void main(String[] args) {
		
		try {
			int i=s.length();
			System.out.println(i);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("프로그램 종료");
		}
	}
}
