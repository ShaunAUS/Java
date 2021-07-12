
public class Annotation {
		
	
		//마커 애노테이션 = 	속성없는, 표시를 달기위해 사용
	    //풀 애노테이션 = 		속싱잇는
		//단일값 애노테이션= 	 value라는 이름의 속성이 1개 정의된
	
	
	
	
	//마커
	@check
	public @interface check{
	 
	}
	//단일값 //사용시 이름 value생략 가능	
	@check("message")
	public @interface check{
		String value()
	}
	
	//풀//속성이름이 value 아니면 생략 불가
	@check(id=1,value="message")
	public @interface check{
		String vlaue();
		int id();
	}
	
	
	@check
	public @interface check{
	 //기본값 사용시 default쓰면됌
		boolean value() default true;
	}
	//---------------------------------------------------------------------------------
	
	//여러개 지정 가능 애노테이션// 가로안에 여러번쓸 애노테이션 집을 만든다
	@Repeatable(Schedules.class)
	public @interface Schedules{
		String dayOfMonth();
	}
	//애노테이션 집 따로 만들어준다, 요소는 배열!!
	public @interface Schedules{
		Schedules[] value();
	}
	
	//애노테이션 여러번 쓸수있다
	@Schedules(dayOfMonth="10 03 00 00")
	@Schedules(dayOfMonth="10 03 00 00")
	@Schedules(dayOfMonth="10 03 00 00")
	public class aaa
	
	//------------------------------------------------------------------------------------------
	
	//타입 애노테이션응ㄴ 형앞에 기술한다
}
