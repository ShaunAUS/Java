import java.util.Scanner;

public class Q008 {
	public static void main(String[] args) {
		//홀수= □
		//짝수= ■
		
		
		
		//가로 칸수 n개
		System.out.println("숫자를 입력하십시오");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		
		
		
		//세로 칸수 8개 // 사각형 n개
		
		for(int i=0;i<8;i++) {
			if(i%2==0) {             //세로 짝수 줄
				
			for(int t=0;t<n;t++){    //세로 짝수줄 요소 첫번째
				
				if(t%2==0) {			//요소가 짝수면
				System.out.print("□");
				}
				else if(t%2!=0) {		//요소가 홀수면
				System.out.println("■");	
				}
				
				}
				
				
				
			}else if(i%2!=0) {        //세로 홀수줄
				
				for(int k=0;k<n;k++) {
					if(k%2==0) {
						System.out.print("■");
					}else if(i%2!=0) {
						System.out.println("□");
					}
				
				}
				
			}
	}
	}}
	
