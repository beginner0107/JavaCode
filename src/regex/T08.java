package regex;

import static org.junit.Assert.*;
import org.junit.Test;

public class T08 {
	@Test
	public void ex8() {
		String pattern = "a*[0-9]?"; // ?은 요소가 0~1회만 반복되는 것을 의미
		assertTrue("aaa".matches(pattern)); // 
		assertFalse("aaa12".matches(pattern)); // [0-9]에 *이 붙어 있지 않음
		
		pattern = "a*[0-9]{0,1}"; // {X,Y}는 X~Y사이의 수만큼 반복
								  // 위의 예제와 같다. 0~1회 반복
		assertTrue("aaa".matches(pattern));
		assertFalse("aaa12".matches(pattern));
	}
}
