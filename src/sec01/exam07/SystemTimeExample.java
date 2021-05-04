package sec01.exam07;

public class SystemTimeExample {	
	public static void main(String[] args) {
		
		long time1 = System.nanoTime(); // 시작 시간 읽기
		
		int sum = 0;
		for ( int i = 1; i <= 1000000; i ++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1부터 1000000까지의 합 : " + sum);
		System.out.println("계산에 " + (time2-time1) + " 나노 초가 소요되었습니다.");
	}
}
