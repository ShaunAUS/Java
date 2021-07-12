package teacherTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Tttest {
		public static void main(String[] args) throws IOException  {
			
			String path="textA.txt";
			Scanner scanner=new Scanner(new File(path));
			
			while(scanner.hasNext()) {
			String line=scanner.nextLine();
			System.out.println(line);
			}
					
			
		}
}
