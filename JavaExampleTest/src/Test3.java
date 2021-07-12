import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test3 {
		public static void main(String[] args) {
			
			//형변환
			List<String>list=new ArrayList<>();
			
			
			
			LinkedList<String> linkedList = (LinkedList<String>) list;
			
			
			//--------------------------------------------
			Object obj=new Integer(1);   // 1 Integer형
			Integer i =Integer.class.cast(obj);
			
			
		}
}
