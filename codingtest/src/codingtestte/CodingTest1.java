package codingtestte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CodingTest1 {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		List list2 = new ArrayList();
		int n = 0;
		
		 int countA=0;
		 int countB=0;
		 int countC=0;
		 int countD=0;
		
		
		//입력
		InputView.inputMethod();
		
		
		// list에 1부터 45까지 숫자 넣기
		for(int i =0; i<=45 ; i++) {
			
			list.add(i);
		}
		
		
		//while(/*result 수만큼*/) {
		
		//섞기
		Collections.shuffle(list);
		
		// list에서 가져온 값 6개를 ->list2 에 랜덤값 6개 넣기
		  list2 = new ArrayList(list.subList(0, 6));
		
		//list2 정렬
		Collections.sort(list2);
		
		//list2 출력
	    System.out.println(list2);
	    
		//}
		
	    
	    
	    //입력2
		InputView.inputMehtod2();
		
		
		
		// list안 요소 3개일치 list2 수
		if(n==3) {
					
		  countA=+1;
		} 
				
		// list안 요소 3개일치 하는 list2 수
		if(n==4) {
			countB=+1;
		}
				
		// list안 요소 5개일치 하는 list2 수
		if(n==5){
		    countC=+1;
		}
				
		// list안 요소 6개일치 하는 list2 수
		if(n==5){
			 countD=+1;
		}

		
		ResultView.resultMethod();
	
	
	}
}
