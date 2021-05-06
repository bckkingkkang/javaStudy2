// 문자열 추출하기
package sec01.exam18;

public class StringSubstringExample {
	public static void main(String[] args) {
		
		String ssn = "991014-1234567";
		
		String firstNum = ssn.substring(0,6);
		String secondNum = ssn.substring(7);
		
		System.out.println(firstNum);
		System.out.println(secondNum);
	}
}
