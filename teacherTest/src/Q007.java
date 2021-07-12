import java.util.Scanner;

public class Q007 {
	public static void main(String[] args) {
		//홀수= □
		//짝수= ■
		
		
		
		//가로 칸수 n개
		System.out.println("숫자를 입력하십시오");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
			
		//세로 칸수 8개 // 사각형 n개
		
		for(int i=0;i<8;i++) {				//세로 줄
			if(i%2==0) {					//세로 짝수행 
				for(int t=0;t<n;t++){		//세로 짝수행 n개만큼 출력
				System.out.print("□");
				}
				System.out.println();	
				
			}else {
				for(int k=0;k<n;k++) {
				System.out.print("■");
				}
				System.out.println();
			}
	}
	}}
	
