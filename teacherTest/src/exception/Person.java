package exception;

public class Person {
	
	static public void set(int i) {
		
		if(i<0) {
			throw new IllegalArgumentException("양수가 없습니다");
		}
		
	}
	
	public static void main(String[] args) {
		
		Person.set(-1);
	}
}
