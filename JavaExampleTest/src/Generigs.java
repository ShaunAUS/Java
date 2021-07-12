import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generigs<T> {
		
		//와일드카드로 얻은값은 항상 object형이다
		//<?> == 와일드 카드형에는 값을 설정할수 없다// null만 가능
	
	
		//List <?>list 에  무슨타입요소가 올지 모르는데  int형을 넣어버림= 오류
		public static void replace(List<?>list,int i) {
			list.set(i, list.get(i-1));        			  //list.set(a.b);   a인덱스위치에 b를저장
		}
		
		
		
		
		//와일드 카드떄문에 요소 못넣으면 다른 메서드를 통해서 list 타입을 E로 정해준다
		
		public static void replace2(List<?>list,int i) {
			replaceHelper(list, i);        			 
		}
		
		// 반환형 e, = list 요소 타입 e
		private static <E> void replaceHelper(List<E>list,int i) {
			list.set(i, list.get(i-1));
		}
		
		
		
		
	public static void main(String[] args) {
		
		
		
		
		
		//Number형이 상한이라고 보증되므로 Number형을 얻을수있다
		List<? extends Number> list=Arrays.asList(1);
		Number number=list.get(0);
		
		
		//Integer형이 하한이라고 보증되므로 Integer형을 설정할수있다
		Number number2=1;
		List<? extends Integer> list2 =new ArrayList<>(Arrays.asList(number2));
		list2.add(2);
	}
	
}
