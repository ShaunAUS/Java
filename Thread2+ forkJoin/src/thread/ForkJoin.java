package thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;


// 1부터n 까지의 합을 계산한 결과를 돌려주는 작업 구현
public class ForkJoin extends RecursiveTask<Long> {

	long from,to;
	
	
	ForkJoin(Long from ,Long to){
		this.from=from;
		this.to= to;

		
	}

	@Override
	protected Long compute() {
		long size= to-from +1;
		
		if(size<= 5) {
			return sum();  //숫자 합 반환
		}
		
		//범위 반으로 나눠서 두개의 작업 생성
		
		long half =(from+to)/2;
		
		ForkJoin leftSum= new ForkJoin(from,half);
		ForkJoin rightSum=new ForkJoin(half+1,to);
		
		leftSum.fork();  // leftSum을 큐에 넣는다 // 비동기 메서드 = 호출 후 결과를 기다리지 않는다.
		
		return rightSum.compute()+leftSum.join();  //동기 메서드 = 결과를 기다린다.
	}

	public static void main(String[] args) {
		
		ForkJoinPool pool= new ForkJoinPool(); //쓰레드 풀을 생성
		ForkJoin task= new ForkJoin(from,to); //수행할 작업 생성
		
		Long result= pool.invoke(task); //invoke()를 호출해서 작업 시작
		
	}
	

}
