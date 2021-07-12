
public class Calculator {
	
	
	double tax;
	
	
	public void setTax(double tax) {
		this.tax=tax;
	}
	
	
	public  int Calc(int price) {
		
		return (int)tax+price;
	}
}
