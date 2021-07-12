package teacherTest;

public class Fighter {
	String name;
	int atk;
	
	
	public Fighter() {
		this.name ="전사";
		this.atk = 10;
	}
	
	public void Attack() {
		System.out.println(name+"공격");
		System.out.println(atk+"데미지");
	}
	
	
}
