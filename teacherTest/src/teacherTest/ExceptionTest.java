package teacherTest;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner s10in=new Scanner(System.in);
		int price=s10in.nextInt();
		double taxRate=s10in.nextDouble();
		
		System.out.println("부가세포함"+price*(1+taxRate)+"원");
	}
	
}
