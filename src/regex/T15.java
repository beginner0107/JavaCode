package regex;

import org.junit.Test;

public class T15 {
	@Test
	public void ex15() {
		String result;
		result = "The cat sat on the mat.".replaceAll("c.+t", "*");
		// 가장 크게 일치하는 cat~mat의 문자열을 패턴으로 인식
		System.out.println(result);
		
		result = "The cat sat on the mat".replaceAll("c.+?t", "*");
		// 가장 적게 일치하는 cat를 문자열의 패턴으로 인식
		System.out.println(result);
		
		/*
		?가 단독으로 사용되면 0또는 1회라는 의미이다. 
		하지만 +, * 등과 함계 사용되면 가장 적은 조건으로 매칭되는 문자열을 찾는다는 의미
		 */
	}
}
