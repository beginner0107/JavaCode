package regex;

import org.junit.Test;

public class T04 {
	@Test
	public void ex4() {
		String result;
		result = "This island is beautiful.".replaceAll("is", "*");
		System.out.println(result);
		
		result = "This island is beautiful.".replaceAll("\\bis\\b", "*");
		System.out.println(result);
		
		// \b는 단어의 경계선을 찾는 역할을 합니다.
		// \b를 사용하여 다른 문자와 결합되지 않은, 독립적인 단어를 찾을 수 있습니다.
	}
}
