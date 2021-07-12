import java.security.SecureRandom;
import java.util.Random;

public class SecureRrandomClass {
	public static void main(String[] args) {
		
		
		//랜덤한 정수//기존은 Random r1=new Random();
		Random r1= new SecureRandom();
		
		int value1=r1.nextInt();
		int value2=r1.nextInt();
		
		System.out.println(value1);
		
		
		
		 //알고리즘과 시드를 지정하고 난수생성 
		 Random r2=SecureRandom.getInstance("SHA1PRNG");
		 int value3=r2.nextInt(); 
		 int value4=r2.nextInt();
		 
	}
}
