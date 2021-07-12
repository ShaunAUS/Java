import java.awt.List;
import java.util.ArrayList;

public class Test5 {
	public static void main(String[] args) {
		int i=1;
		
		List<Integer>list= new ArrayList<>();
		
		list.add(i);//오토박싱
		
		//remove
		list.remove(i);// 1번쨰(인덱스) 요소 삭제
		list.remove(new Integer(i)); // 값이 1인 요소를 삭제//객체
		
		
	}
}
