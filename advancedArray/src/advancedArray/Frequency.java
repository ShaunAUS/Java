package advancedArray;

public class Frequency {
	
	public static void main(String[] args) {
		int[] numArr1 = new int[10];
        int[] counter = new int[10];

        for (int i =0; i < numArr1.length; i++) {
                numArr1[i] = (int)(Math.random()*10);
                System.out.println(numArr1[i]);
        }
        System.out.println();

        for(int i =0; i < numArr1.length; i++){
            counter[numArr1[i]]++;
        }

        for(int i =0; i < numArr1.length; i++){
            System.out.println(i+"의 개수:"+counter[i]);
        }
	}
}
