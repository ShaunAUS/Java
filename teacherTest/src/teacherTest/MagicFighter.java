package teacherTest;

public class MagicFighter extends Fighter {
	int mp;

	public  MagicFighter() {
		this.name="마법사";
		this.mp=10;
	}
	
	
	@Override
	public void Attack() {
		System.out.println(name+"공격");
		System.out.println("적에게"+(atk+mp)+"데미지");
	}
	
}
   
