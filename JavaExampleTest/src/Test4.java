import java.awt.List;
import java.util.ArrayList;

public class Test4 {
     public static void main(String[] args) {
		//래퍼클래스   기본형을 객체로
    	 int i = 10;
    	 Integer obj=new Integer(i);
    	 
    	 //리스트는 객체만 저장가능,  기본형을 객체로 바꾸기= 래퍼클래스
    	 List<Integer> list = new ArrayList<>();
    	 list.add(obj);
    	 
    	 //래퍼에서 기본형 꺼내기
    	 int i2 = obj.intValue();
    	 
    	 
    	 
    	 
    	 
 	}
}
