import java.math.BigDecimal;

public class MathEtc {
	public static void main(String[] args) {
		
		
		//BigDecimal()   은행 등 자세한 계산시 사용, 정확도 높지만 속도 느리다
		
		//나눗셈만 좀 다르다
		BigDecimal bd=new BigDecimal(1.1);
		
		BigDecimal bd2=new BigDecimal(2.2).add(bd);
		
		
		
		//부호가 없는 정수 다루기
		//최댓값보다 큰값, 최소값보다 작은값,
		//long, integer static메서드이다.  //toUnsignedString();  정수를 문자열로 출력
		
		
		//int 최대값 +1, 그냥 출력 하면 오류
		int a=(2147483647)+1;
		
		String a2=Integer.toUnsignedString(a);
		
		
		//문자열을 다시 정수로// 부호없는 정수
		int a3 =Integer.parseUnsignedInt("2147483647");
	}
}
