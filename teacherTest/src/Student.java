
public class Student {
	String name;
	int kor;
	int mat;
	int eng;
	
	//매개변수 생성자
	Student(String name2,int kor2,int mat2,int eng2){
		name=name2;
		kor=kor2;
		mat=mat2;
		eng=eng2;
	}
	//매개변수 생성자 끝
	
	
	//생성자2
	Student(String name){
		this("name2",0,0,0);
	}
	//생성자2끝
	
	public void Show() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		//인스턴스 생성
		Student hong=new Student();
		hong.name="홍길동";
		hong.kor=80;
		hong.mat=75;
		hong.eng=90;
		Student Lee=new Student("이순신",90,70,80);
		Student Park=new Student("박길동",0,0,0);
		
		//인스턴스 생성 끝
		
		//배열 만들고 배열에 인스턴스 넣기
		Student[] students=new Student[3];
		students[0]=hong;
		students[1]=Lee;
		students[2]=Park;
		//배열 만들고 배열에 인스턴스 넣기 끝

		int i;
		
		//배열 출력
		System.out.println("성적표");
		for(i=0;i<students.length;i++) {
			System.out.println(students[0]);
		}
		//배열 출력 끝
	}
}
