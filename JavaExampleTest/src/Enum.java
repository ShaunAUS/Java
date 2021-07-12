
public class Enum {
	
	
	//열거형도 생성자정의해서 초기화가능
	//enum 이름    ==이름을 클래스(studnet) 라고 생각하자
	//enum 안에있는 값들은 인스턴스로 생각하자
	
	
	public enum Sex{
		man(1),woman(2);		//여기에서 생성자호출

		
		
		private Sex(int code) {
			this.code=code;
		}
		
		public int getCode() {
			return code;
		}
		
		private final int code;
	}
	
	
	
	public static void compare(Sex sex) {
		switch(sex) {
		
		case man :
			System.out.println("남자입니다");
			break;
		case woman :
			System.out.println("여자입니다");
			break;
			
		}
	}
		
	
	
		public static void main(String[] args) {
			
			compare(Sex.man);
			
			//생성자에서 설정한 초기값 구하기
			Sex woman=Sex.woman;               //Student(클) kim=인스턴스가르킴(woman)
			int code=woman.getCode();			//kim.getCode();
		}
	}





