
public class NewHero {
	String name;
	int hp;
	
	NewHero(String name,int hp){
		this.name=name;
		this.hp=hp;
	}
	
	@Override
	public String toString() {
		return name+hp;
		
	}
	
	
	public static void main(String[] args) {
		NewHero minjae=new NewHero("minjae",100);
		
		System.out.println(minjae);
		
		
		
	}
}
