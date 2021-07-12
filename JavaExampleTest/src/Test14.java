import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Test14 {
	public static void main(String[] args) {
		
		
		int i;
		//반복 도중에 끝내기
		ArrayList<String> list= new ArrayList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		
		
		for(String str : list) {
			
			if("a".equals(str)) {
				continue;
			}else {
				System.out.println(str);
			}
		}
		
		
	}
}
