package teacherTest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Url {
	public static void main(String[] args) {
		
	 URL u=null;
	 
	 
	 u=new URL("https://www.naver.com/");
	 
	 
	 
	 InputStream in =u.openStream();
	 InputStreamReader is = new InputStreamReader();
	 
	 BufferedReader br= new BufferedReader(is);
	 String s;
	 
	 while((s=br.readLine())!=null){
		 System.out.println(s);
	 }
}
}