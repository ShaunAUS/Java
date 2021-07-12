
public class NumberFormat {

	public static void main(String[] args) {
		
		
		//정수값을 형식화 = 1.000.000
		String result1=NumberFormat.getIntegerInstance().format(10000000);
		//통화 형식으로 형식화   =  |w1.000.000
		String result2=NumberFormat.getCurrencyInstance().format(100000);
		//백분율 형식으로 형식화    =80%
		String result3=NumberFormat.getPercentInstance().format(0.8);

	}

}
