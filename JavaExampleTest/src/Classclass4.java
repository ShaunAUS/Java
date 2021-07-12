import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Classclass4 {

	
		//getConstructors =  for문으로
		//getConstructor(인수 타입)
		
		//getMethods =for문으로
		//getMethod(메서드이름,인수타입)
		public class SampleBean{
			
			
			private int field;
			
			public int getData() {
				return field;
				
			}
			
			public void add(int add) {
				this.field=add;
			}
		}
	
		
	public static void main(String[] args) {
		
		
		SampleBean sb=new SampleBean();
		
		
		//-------------------------호출 , 대입--------------------------------------------
		// invoke, set /첫번쨰 매개변수 어디서 실행할지/두번쨰 대입값// static이면 첫번쨰 null
		try {
			//메소드 인수있음//getMethod(메서드이름,인수타입)
			// 메서드 호출 invoke(어디서 실행하는지,넣을인수값)
			Method addMethod=SampleBean.class.getMethod("add", int.class);
			addMethod.invoke(sb, 100);
			
			//메소드 인수없음
			Method getDataMethod=SampleBean.class.getMethod("getData");
			Object methodResult=getDataMethod.invoke(sb);
			
			
			//필드
			//public 이외 필드  private field
			Field field=SampleBean.class.getDeclaredField("field");
			field.setAccessible(true); //private니까 접근허용 or 
			
			//필드값대입
			field.set(sb, 200);
			Object fieldValue=field.get(sb);
			
			
			//예외처리 많이나오는데 이거하나로 ok
		} catch (ReflectiveOperationException e) {
			
			e.printStackTrace();
		}
		
	
		
	}

}
