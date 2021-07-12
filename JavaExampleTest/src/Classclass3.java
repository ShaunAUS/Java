import java.lang.reflect.InvocationTargetException;

public class Classclass3 {

	
	
	public static void main(String[] args) {
			
			try {
				//인수 없이 생성자 사용할떄

				StringBuilder sb= StringBuilder.class.newInstance();
				
				
				
				//인수 있는 생성자 사용할떄
																	//인수이름타입
				StringBuilder sb= StringBuilder.class.getConstructor(String.class).newInstance("초기값");
				
				
			} catch (ReflectiveOperationException e) {
			
				e.printStackTrace();
			} 
		

	}

}
