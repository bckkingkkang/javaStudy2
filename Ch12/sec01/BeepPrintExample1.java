// 메인 스레드만 이용하는 경우
package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		
		// Toolkit 객체 얻기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for ( int i = 0; i < 5; i++ ) {
			// 비프음 발생
			toolkit.beep(); 
			try {
				// 0.5초간 일시 정지
				Thread.sleep(500);
			} catch(Exception e) { }
		}
		for ( int i = 0; i < 5; i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) { }
		}
	}
}
