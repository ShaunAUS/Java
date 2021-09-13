package codingtestte;

public class ResultView {
		
	
	static int countA;
	static int countB;
	static int countC;
	static int countD;
	
	
	public static void resultMethod() {
		
		
		
	System.out.println("당첨통계");
	System.out.println("--------");
	
	
	//당첨 개수
	// 숫자개수 일치   = 몇개인지
	System.out.println("3개일치 (5000원)-"+ countA+"개");
	System.out.println("4개일치 (50000원)-"+ countB+"개");
	System.out.println("5개일치 (1500000원)-"+ countC+"개");
	System.out.println("6개일치 (2000000000원)-"+ countD+"개");
	}
}
