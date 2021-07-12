import java.util.ArrayList;

public class Test15 {
	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList();
		//이름있는 for문 빠져나오기
		int i;
		

		list.add("a");
		list.add("b");
		list.add("c");
		
		
		outer : for(i=0;i<list.length;i++) {
			while(true) {
				break outer;
			}
			
		}
	}
}
