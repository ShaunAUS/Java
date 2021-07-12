import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection1 {
		
	//스레드 세이프 컬렉션클래스 
	// - 여러스레드에서 컬렉션클래스의 인스턴스에 대한 조작을 해야할떄 컬렉션 대신에 
	
	public static void main(String[] args) {
		
		
		//범위 넘으면 0으로 채워짐 
		int[] arr = {10,20,30};
		int[] arr2= Arrays.copyOf(arr, arr.length);
		
		//얇은 복사
		
		Point[] p1= {new Point(10,20),new Point(30,40)};
		Point[]p2=Arrays.copyOf(p1, p1.length);
		
		//깊은복사
		Point[] p3={new Point(10,20),new Point(30,40)};
		Point[] p4= new Point[2];
		
		
		for(int i=0;i<p4.length;i++) {
			p4[i]=new Point(p3[i].x,p3[i].y);
		}
		
		//ArrayList =내부적으로 '배열'을 이용한다. list인터페이스의 크기를 변경할수 있는 배열로 구현한 클래스
		
		
		List<String>list= new ArrayList<>();
		
		list.add("A");
		list.add("b");
		list.add("c");
		
		list.add(3,"d");     //3번쨰에 d추가
		list.set(2,"hi");    //2번쨰 hi 로 바꿈
		list.replaceAll(s->s.toLowerCase());  //모든요소 람다식에 맞춰 바꿈
		
		
						//list
		//removeAll(collection c)  해당요소들 삭제
		//retainAll (collectio c) 해당요소들 외 삭제
		//removeIf(s->s.startsWith("J"))
		
		//위에 3개 결과는 boolean , list를 뽑아야 확인가능 
		//All 들어가면 인수 collection
		
		
		
		
		//일반 반복 처리
		for(String value:list) {
			System.out.println(value);
		}
		//람다 반복 처리// foreach()
		list.forEach(s->System.out.println(s));
		
		
		
		
		//contains
		//containsAll(collection c)
		
		//add
		//addAll(Collection c)
	//-------------------------------------------------------------------------	
		//Set 도 메서드 다 똑같음
		//collection = foreach 가능
		
		//map, set 크기 정할수있다
		Set<String> ss= new HashSet<String>(100);
		Map<String,Integer> mm=new HashMap<>(100);
		
		// map=  compute, computeIfqAbsent, computeIfPresetn, getorDefaul, replace, replaceAll, putIfAbsent
		
		mm.put("A", 1);
		mm.put("B",	2);
		mm.put("C", 3);
		Integer replaced=mm.replace("A", 4);
		System.out.println(replaced); //변환된값은 쓰기 전의 값
		
		
		
	
	}
	
}
