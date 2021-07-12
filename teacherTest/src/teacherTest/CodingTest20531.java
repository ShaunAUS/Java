		import java.util.*;
		public class Exam003 {
			
		}
		 int movecount = 0;
		 public void shift() {
		 Scanner scan = new Scanner(System.in);
		 int garo=scan.nextInt();   //행
		 int sero=scan.nextInt();	//열
		 System.out.printf("임의의 수열 입력 (공백구분): ");
		 int[] first = shiftToArray(scan.nextLine());
		 System.out.printf("임의의 수열 입력 (공백구분): ");
		 int[] second = shiftToArray(scan.nextLine());
		 System.out.printf("임의의 수열 입력 (공백구분): ");
		 int[] third = shiftToArray(scan.nextLine());
		 System.out.println("치환완료");
		 
		 
		 
		 print(shiftToNewArray(first,second,third));
		 }
		 
		 
		 public int[] shiftToArray(String inputJason) {
		 String jason [] = inputJason.split(" ",0);
		 int numbers [] = new int[jason.length];
		 for (int i = 0; i < jason.length; i++){
		 numbers[i]= Integer.parseInt(jason[i]);
		 }
		 return numbers;
		 }
		 
		 
		 public int[][] shiftToNewArray(int[] array1, int[] array2, int[] array3) {
		 int[][] returnArray = new int[array1.length][3];
		 for (int i = 0; i < array1.length; i++) {
		 returnArray[i][0] = array1[i];
		 returnArray[i][1] = array2[i];
		 returnArray[i][2] = array3[i];
		 }
		 return returnArray;
		 }
		 public void print(int [][] outputArray){
			 for (int array [] : outputArray){
				 for(int i : array){
				 System.out.print(i + " ");
				 }
				 System.out.print("\n");
				 }
				 }
				 public static void main(String[] args) { new Exam003().shift(); 
		 }