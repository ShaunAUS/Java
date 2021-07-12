package teacherTest;

public class Manager extends Employee {
	
	//manager 메서드
	public void Management() {
		System.out.println(name+"는 관리 업무를 합니다");
		
		
	}
	
	public static void main(String[] args) {
		Employee taro=new Employee();
		taro.name="홍길동";
		
		Manager hanako=new Manager();
		hanako.name="이순신";
		
		taro.Operation();
		hanako.Operation();
		hanako.Management();
	}
}
