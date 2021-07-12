import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map.Entry;

public class Enum2 {
	
	
	public interface color{
		public String getColor();
		
	}
	
	
	//enum 인터페이스 구현도 가능
	
	
	public enum Flag{a,b,c,d};
	
	
	public enum Sex implements color{
		Man{
			@Override
			public String getColor() {
				return "파랑";
			}
			
			},
		
		woman{
			@Override
			public String getColor() {
				return "노랑";
			}
		};
	}
	
	public static void main(String[] args) {
		color color1=Sex.Man;
		String str1=color1.getColor();
		
		color color2=Sex.woman;
		String str2=color2.getColor();
				
		System.out.println(str1);
		
		//----------------------------------------------------------------
		//EnumSet , EnumMapl 가능
		//a와b 플래그 생성	
		EnumSet<Flag>flags=EnumSet.of(Flag.a,Flag.b);
	
		flags.contains(Flag.a);
		
		//EnumMap
		
		EnumMap<Sex,Integer>map =new EnumMap<>(Sex.class);
		
		map.put(Sex.woman, 1);
		map.put(Sex.Man, 2);
		
		for(Entry<Sex,Integer>entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		//key만 구하기
		for(Sex sex:map.keySet()) {
			System.out.println(sex);
		}
		//value만 구하기
		
		for(Integer a:map.values()) {
			System.out.println(a);
		}
		
		
	
	
	}
}
