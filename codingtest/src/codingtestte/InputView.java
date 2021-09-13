package codingtestte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InputView {
	
	List list = new ArrayList();
	static List list2 = new ArrayList();
	static int n = 0;
	
	
	
	 public static void inputMethod() {
		 System.out.println("구입 금액을 입력해 주세요");
			//스캐너 생성
			Scanner sc =new Scanner(System.in);
			// 구입금액 값 받기
			int input=sc.nextInt();
			
			
			System.out.println(input/1000+"개를 구매 하였습니다.");    // 고쳐야함
		 
	 }
	 
	 
	 public static void inputMehtod2() {
		 
		 System.out.println("지난주 당첨 번호를 말씀 해주세요");
			Scanner sc2 =new Scanner(System.in);
			String[] number=sc2.nextLine().split(",");
			
			if(list2.contains(number)) {
				
				   // n= 몇개가 일치하는지 // list2 안의 요소가 입력값 number 과 몇개가 일치하는지
				   n=Collections.frequency(list2, number);
				}
			
			
	 }
	
	
}
