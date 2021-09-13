package codingtestte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {
	
	
	static List list = new ArrayList();
	static List list2 = new ArrayList();
	static int input;
	static int n = 0;
	 
	static int countA;
	static int countB;
	static int countC;
	static int countD;
	
	public static void mix() {
		// list에 1부터 45까지 숫자 넣기
				for(int i =0; i<=45 ; i++) {
					
					list.add(i);
				}
				
				
				for(int t=0; t<=input/1000; t++) {
				
				//섞기
				Collections.shuffle(list);
				
				// list에서 가져온 값 6개를 ->list2 에 랜덤값 6개 넣기
				  list2 = new ArrayList(list.subList(0, 6));
				
				//list2 정렬
				Collections.sort(list2);
				
				//list2 출력
			    System.out.println(list2);
			    
				}
				
			
	}
	
	public static void match() {
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
	}

}
