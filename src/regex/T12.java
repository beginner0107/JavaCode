package regex;
import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;

//숫자패턴 찾기
public class T12 {
	@Test
	public void ex11() {
		Pattern pattern = Pattern.compile("\\d{3}-\\d{5}");
		// //d -> 0~9사이의 숫자 == [0-9]
		// {3} -> 3회 이상 반복
		// - ?
		Matcher matcher = pattern.matcher("123-45678");
		// 0~9의 숫자를 3회 반복하고, 5회 반복하였다.
		assertTrue(matcher.find());
	}
}
