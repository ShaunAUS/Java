package teacherTest;

public class CodingTest4 {
	public static void main(String[] args) {
		
		
		int[] a = new int[11];
		//0부터 10까지 
        for (int i = 0 ; i<a.length;i++) {
            a[i] = i;
        }
        
        
        
        for (int i= 0; i<6; i++) {   //행
            for (int j = 0; j<a.length; j++) {       //열>행 or 
                if(j<i||j>a.length-i-1) {
                    System.out.print(" ");

                }
                else {
                    System.out.print(a[j]);
                }
            }
            System.out.println();
        }
    }
}
