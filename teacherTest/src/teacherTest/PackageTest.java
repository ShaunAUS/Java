package teacherTest;

public class PackageTest {
	
	
	static void sayHello() {
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args) {
		int x=1234567;
		
		java.text.DecimalFormat df= new java.text.DecimalFormat(",###");
		
		System.out.println("x="+x);
		System.out.println("x="+df.format(x));
		
		
		
		
		
	}
}
