package teacherTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintList1 {
	public static void main(String[] args) {
		FileReader fr=null;
		try {
			fr=new FileReader(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다");
			System.exit(0);
		}
		
		Scanner sin=new Scanner(fr);
		while(sin.hasNext()) {
			String s=sin.nextLine();
			System.out.println(s);
			
		}
		sin.close();
		try {
			fr.close();
		} catch (IOException e) {
			System.out.println("io 오류 발생");
		}
		
	}
}
