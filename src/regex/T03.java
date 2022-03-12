package regex;

import org.junit.Test;

public class T03 {
	@Test
	public void ex3() {
		String result;
		result = "The cat sat on the mat".replaceAll("cat", "*");
		System.out.println(result);
		
		result = "The cat sat on the mat cat".replaceAll("cat$", "*");
		System.out.println(result);
		
		// $는 문자열의 종료지점을 찾는다. 
		// 따라서 $앞의 패턴으로 문자열의 끝나는 것을 찾는다.
	}
}
