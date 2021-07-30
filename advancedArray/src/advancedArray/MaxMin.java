package advancedArray;


public class MaxMin {
	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 10, 55, 95};

        int max = score[0];// 배열 첫번쨰 값으로 최대값 초기화
        int min = score[0];// 배열 첫번쨰 값으로 최소값 초기화


        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        } // for문 끝 

        System.out.println("최대값:" + max);
        System.out.println("최대값:" + min);
	}
}
