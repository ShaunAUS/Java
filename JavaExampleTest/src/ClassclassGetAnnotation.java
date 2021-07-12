
public class ClassclassGetAnnotation {
		
	    //   () 안에 애노 이름.class
			
		//getAnnotation(); 지정한 어노테이션을 구한다. 슈퍼클래스에 부여 어노까지
		//getAnnotations() ; 모든 어노테이션 구함, 슈퍼클래스에 부여한 어노 까지
		//getAnnotationByType(); 여러개 지정할수있다. 슈퍼 포함 
	
		//getDeclaredAnnotation(); 지정한 어노구한다, 슈퍼 x
		//getDeclaredAnnotations(); 모든 어노 구함, 슈퍼 x
		//getDeclaredAnnotationByType(); 여러개 지정할수있다. 슈퍼x
	
	
		public static void main(String[] args) {
			
			
			//어노테이션 정의
			@Retention(Runtime)
			public @interface Check{
				String value();
			}
			
			
			//조작 대상 클래스
			@Check("클래스에부여")
			public class AnnotationSample{
				@Check("메소드에부여")
				public void print(@Check("인수에부여")String message) {
					System.out.println(message);
				}
			}
			
			Class<AnnotationSample>clazz=AnnotationSample.class;
			
			//클래스 부여 어노 얻기
			Check check=clazz.getAnnotation(Check.class);
			check.value();
			
			//메소드 어노 구하기
			Method method=clazz.getMethod("print",String.class);
			if(method.isAnnotationPresent(Check.class)) {
				method.getAnnotation(Check.class).value();
			}
			
			//메소드 인수 어노구하기
			for(Annotation[] params:method.getParameterAnnotations()) {
				for(Annotation annotation:params) {
					((Check)annotation.value());
				}
			}
			
			
			
			
			
			
			
			
			
			
			
		}
}
