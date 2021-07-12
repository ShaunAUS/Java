import java.util.Scanner;

public class Algorism {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("오늘은 몇일입니까?");
		System.out.println("몇월?"+"=");
		Integer input=sc.nextInt();
		
		
		System.out.println("며칠?"+"=");
		Integer input2=sc.nextInt();
		
		if(input==(5)||input.equals("5월")) {
			System.out.println("오늘");
		}
		
	}	
}
