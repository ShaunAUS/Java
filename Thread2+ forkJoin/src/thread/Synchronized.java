package thread;


// 동기화 예제
class Test{
	
	public static void main(String[] args) {
		
		Synchronized r= new Synchronized();
		
		new Thread(r).start(); //threadGroup에 의해 참조되므로 gc대상이 아니다
		new Thread(r).start(); //threadGroup에 의해 참조되므로 gc대상이 아니다
	}
}



class Account{
	
	private int balance= 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if(balance>= money) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			
			balance -=money;
		}
	} //with draw 끝
}


public class Synchronized implements Runnable{
	
	
	Account acc= new Account();

	public void run() {
		
		while(acc.getBalance()>0) {
			
			int money=(int)(Math.random()*3+1)*100;
			acc.withdraw(money);
			System.out.println("balance:" +acc.getBalance());
		}
		
	}//run 끝

}
