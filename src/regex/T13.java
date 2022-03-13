package regex;

import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
/*
Backreferences
- Regex에서 이전에 사용된 subpattern을 참조하는 것도 가능 
- 이것을 Backreferences
- Backreferences는 \n으로 표현. 
ex) 
\1는 첫번째 subpattern이며, \2는 두번째 subpattern
 */
public class T13 {
	@Test
	public void ex13() {
		Pattern pattern = Pattern.compile("c(..) s\\1");
		// c + 문자 두개,공백s가 1번째 subpattern
		Matcher matcher = pattern.matcher("The cat sat on the mat");
		
		assertTrue(matcher.find());
	}
	
	@Test
	public void ex13_1() {
		Pattern pattern = Pattern.compile("\\b(\\w+)\\s+\\1\\b");
		// \\b -> 단어의 공백
		// (\\w+)1번 그룹 -> 알파벳과 숫자 1회 이상 반복
		// \\s+ -> 공백 1회 이상반복
		// 1번째 subpattern = ("\w+")을 의미

		// \\b -> 단어의 경계(공백)를 찾는다.
		// 동일한 단어가 연달아 오는 String은 이 패턴과 일치하게 된다.
		Matcher matcher = pattern.matcher("hello world world");
		assertTrue(matcher.find());
	}
}
