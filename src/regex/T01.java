package regex;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class T01 {
	@Test
	public void ex1() {
		String pattern = "ab.";
		assertFalse("aㅠ".matches(pattern));
		assertTrue("abc".matches(pattern));
		
		pattern = "ab\\s\\S";
		assertFalse("ab".matches(pattern));
		assertTrue("ab c".matches(pattern));
		// 패턴에서 "."는 문자 1개에 해당
		// 그 문자가 숫자인지 whitespace인지는 중요하지 않습니다.
		// 아래 예제에서 패턴 "ab."는 "ab"와 일치하지 않습니다. "ab"뒤에 문자가 없기 때문
		
		// \s는 whitespace 1개, \S는 whitespace를 제외한 문자 1개를 의미합니다.
		// 자바에서 \를 표현하려면 \\처럼 사용해야 합니다. 
	}
}
