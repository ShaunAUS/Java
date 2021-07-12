
public class Q003 {
	public static void main(String[] args) {
		int[] A= {1,2,3,4,5};
		int[] B = {6,7,8,9,10};
		int[] C= new int[5];
		
		
		for(int a=0;a<A.length;a++) {
			C[a]=A[a]+B[a];
			
		}
		
		
		
		for(int c=0;c<C.length;c++) {
			System.out.println(C[c]);
		}
	}
}
