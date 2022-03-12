package regex;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class T05 {
	@Test
	public void ex05() {
		String pattern = "[abc][vz]";
		assertTrue("av".matches(pattern)); // a+v조합
		assertFalse("ac".matches(pattern)); // a+c -> c가 vz에 없다

		pattern = "Ex_[a-g1-5]"; // Ex로 시작해서 a부터 g, 1부터 5
		assertTrue("Ex_g".matches(pattern)); // TRUE
		assertFalse("Ex_6".matches(pattern)); // FALSE 6은 1~5 범위 안에 들어가 있지 않다.
		
		// []는 내부의 문자열과 일치하는 문자 1개를 찾습니다. "-"를 사용하여 범위를 지정할 수도 있습니다.
	}
}
