package advancedArray;

public class Sorting {
		
	public static void main(String[] args) {
		int[] numArr = new int[10];
        for (int i = 0;i<numArr.length; i++){
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();
        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;

            for (int j = 0; j < numArr.length - 1 - i; j++) {

                //옆의 값과 비교를 한다// 왼쪽이더크면 자리를 바꿔주고 아니면 그대로 한다.
                //이렇게 하면 가장 큰값은 맨오른쪽에 위치하게된다.  = 그래서 for문에서 -1씩 뺸다

                if (numArr[j] > numArr[j + 1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                    changed = true;
                }
            }
	}
	
	}}
