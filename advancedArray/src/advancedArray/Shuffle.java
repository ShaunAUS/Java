package advancedArray;

public class Shuffle {
	
	public static void main(String[] args) {
		int[] numArr = new int[10];

        //배열로 0~9 채우기
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.println(numArr[i]);

        }

        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
	}
	
}
