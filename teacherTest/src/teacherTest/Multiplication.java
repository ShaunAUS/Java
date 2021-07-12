package teacherTest;

public class Multiplication {
  int dn;
  int time;
  
  Multiplication(int d,int t){
	  dn=d;
	  time=t;
  }
  
  void start(){
	  for(int i=1; i<=9;i++) {
		  System.out.println(dn*i);
		  try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	  }
	  
  }
  
  public static void main(String[] args) {
	  Multiplication a = new Multiplication(5, 500);
	  Multiplication b = new Multiplication(6, 700);
	  Multiplication c = new Multiplication(7, 110);
	  a.start();
	  b.start();
	  c.start();
}
}
