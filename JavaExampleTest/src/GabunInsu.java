
public class GabunInsu {
	
	
	//가변인수는 인수중에 맨마지막에 쓰기.
	static public void method(String...args) {
		for(String arg:args) {
			System.out.println(arg);
		}
	}
	
	
	//가변인수는 호출된 메소드 내부에서 '배열'로 다룬다.
	public static void main(String[] args) {
		GabunInsu.method("a","b");
		
	}
}
