package teacherTest;

public class Exam  extends Exception{
	
	
	
	static public void loop () throws ArrayIndexOutOfBoundsException{
		
	 int[] arr= {10,20,30};
	 
	 	for(int i=0; i<4; i++) {
		 System.out.println(arr[i]);
	} 
	 
	}
	
	public static void main(String[] args) {
		
		try {
			Exam.loop();
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다33333");
			e.printStackTrace();
		}
	}
}
