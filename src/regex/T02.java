package regex;

import org.junit.Test;

public class T02 {
	@Test
	public void ex2() {
		String result;
		result = "The cat sat on the mat.".replaceAll("[Tt]he", "*");
		System.out.println(result);
		
		result = "The cat sat on the mat.".replaceAll("^[Tt]he", "*");
		System.out.println(result);
		
		// ^는 문자열의 시작지점을 찾습니다. 따라서 ^ 다음으로 오는 패턴으로 문자열이 시작되는 것을 찾습니다.
		
	}
}
