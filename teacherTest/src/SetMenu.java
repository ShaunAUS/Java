
public class SetMenu {
	SetMenu hamburgerSet;
	Menu hamburger;
	Menu drink;
	
	
	public SetMenu(SetMenu hamburgerSet, Menu hamburger, Menu drink) {
		super();
		this.hamburgerSet =hamburgerSet;
		this.hamburger = hamburger;
		this.drink = drink;
	}
	
	public void Display2() {
		
	}
	public static void main(String[] args) {
		Menu hamburgerSet= new Menu("햄버거 세트");
		Menu drink = new Menu( "콜라" , 1000 );
		Menu hamburger = new Menu( "햄버거" , 1500 );
		
	}
}
