import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String input=sc.nextLine();
		
		 System.out.println("비밀번호는?:");
		 if(input.equals("hello")) {
			 System.out.println("환영 합니다");
		 }else {
			 System.out.println("비밀번호 불일치");
		 }
	}
}
