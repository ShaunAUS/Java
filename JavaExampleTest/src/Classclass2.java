import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Classclass2 {
	
		//file클래스의 생성자 얻기
	
		for(Constructor<?> constructor:File.class.getConstructors()) {
			
			// public name(인수){}
			
			//생성자명
			String name=constructor.getName();
			
			//인수형// 배열로 받는다  인수가 2개이상일수도 있으니
			Parameter[]type=constructor.getParameters();
			
			//수식자가 public인지
			boolean mod=constructor.isPublic(constructor.getModifiers());

			}
		
		
	//----------------------------------------------------------------------------------------------	
		
		
		
		//file 클래스(슈퍼클래스도 포함)의 public 메소드 얻기
		
		

		for(Method method:File.class.getMethods) {
			
			// public name(인수타입){}
			// 반환타입
			
			
			//이름
			String name2=method.getName();
			//인수// 배열로 반환 ,2개이상일수도 있으니
			Class<?>[]type2=method.getParameterTypes();
			
			//반환타입
			Class<?>params=method.getReturnType();
			
			//static인지 public인지
			boolean mod2=method.isStatic(method.getModifiers());
			
		}
		
		
		//----------------------------------public 이외의 멤버 구하기----------------------
		
		file.class.getDeclaredConstructors();
		
		file.class.getDeclaredMehtods();
		
		file.class.getDeclaredFields();
		
		
		
		//----------------------------생성자, 메서드 인수이름 구하기----------------------------------------
		//   -parameters옵션 설정  = properites - store information about method pararameters 체크
		
		//Executable -getParameters()  로구한다
		
		
		//생성자(인수이름타입)
		
		Excutable exe=User.class.getConstructor(String.class);
		
		for(Parameter param:exe.getParameters()) {
			String name=param.getName();
		}
		
		//조작대상 클래스
		
		public class User{
			
			private final String initial;
			
			public User(String initial) {
				this.initial=initial;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}
