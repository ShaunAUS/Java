import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Maap {
	public static void main(String[] args) {
		Set<String> ss= new HashSet<String>(100);
		Map<String,Integer> mm=new HashMap<>(100);
		
		// map=  compute, computeIfqAbsent, computeIfPresetn, getorDefaul, replace, replaceAll, putIfAbsent
		
		mm.put("A", 1);
		mm.put("B",	2);
		mm.put("C", 3);
		Integer replaced=mm.replace("A", 4);
		System.out.println(replaced);
		System.out.println(mm);
		//B의값이 2이면 5로 치환 
		boolean isReplaced=mm.replace("B", 2 , 5);
		System.out.println(isReplaced);
		System.out.println(mm);
			
		mm.replaceAll((key,value)->value.intValue());
		
	//----------------------------------------------------
		Map<String,String> m2= new HashMap();
		m2.put("A","1");
		//(람다식의 반환값)을 Map에 추가한다
		//람디식 인수: key(키), existValue(이미키가 존재할경우 그값, 아니면 null)
		m2.compute("B", (key,existValue)->{
			if(existValue!=null) {
				//이미키가 존재하면 그값을 그대로 사용
				return existValue;
						
			}else {
				//키가 존재하지 않으면 Nothing이란값을 추가
				return "Nothing";
			}
		});
		//b값이 없으면 람다식 결과값 반환//b있음
		m2.computeIfAbsent("B", key->key+"does not exist");
		m2.computeIfAbsent("c", c->c+"does not exist");
		System.out.println(m2);
		
		
		//키가 존재하는 경우에만 람다식 반환값을 치환// b값 이미 존재하므로 덮어씌운다
		m2.computeIfPresent("B",(key,existValue)->key+"is exist"+existValue );
		
		//merge()  1, 키가 없는 경우는 지정한 값을 설정할수있고/ 2, 키가 있는경우는 기존값과+지정된값 을 람다식에서 통합한 값으로 치환
		Map<String,String>map=new HashMap<>();
		map.put("A","good");
		
		//키가 존재하므로 람다식의 결과값을 치환
		map.merge("A", "Java",(oldValue,newValue)->newValue+"is"+oldValue);
		//키가 없으므로 지정한값 을 값으로써 설정함ㄴ
		map.merge("B", "JAVA", (oldValue,newValue)->newValue+"is"+oldValue);
		
		System.out.println(map);
		
		Map<String,String>m3 =new HashMap();
		m3.put("A", "hi");
		//첫째 인수키가 없으면 두번쨰인수값 반환
		System.out.println(m3.getOrDefault("A", "-"));
		System.out.println(m3.getOrDefault("B", "fuck"));
		
		//entrySet();
		
		Map<String,String>m4= new HashMap();
		m4.put("a", "1");
		m4.put("b", "2");
		m4.put("c", "3");
		
		Set<Map.Entry<String,String>>set=m4.entrySet();
		
		for(Map.Entry<String,String> entry:set) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		
		//for 향상문= foreach
		map.forEach((key,value)->System.out.println(key+","+value));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
