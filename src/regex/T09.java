package regex;

import org.junit.Test;
/*
	패턴에 그룹을 지정할 수 있다. 그룹은 ()로 지정하며, 그룹을 표현할 때는 
	$1 처럼 $ 다음에 그룹의 번호를 입력합니다. 패턴에서 가장 왼쪽 그룹이 1번으로 시작
	
 */
public class T09 {
	@Test
	public void ex9() {
		String pattern = "(\\w)(\\s+)([\\w])";
		// 1번 그룹(\\w)   : 알파벳, 숫자 문자 -> [a-zA-Z_0-9]와 동일
		// 2번 그룹(\\s+)  : whitespace 1개 [\t\n\x0b\r\f]와 동일
		// 3번 그룹([\\w]) : 하나의 알파벳 -> One of 알파벳 or 숫자
		System.out.println("Hello          world".replaceAll(pattern, "-"));
		System.out.println("Hello          1orld".replaceAll(pattern, "-"));
		
		pattern = "(\\w)(\\s+)([\\w])";
		// 1번 그룹(\\w)   : 알파벳, 숫자 문자 -> [a-zA-Z_0-9]와 동일
		// 2번 그룹(\\s+)  : whitespace 1개 [\t\n\x0b\r\f]와 동일
		// 3번 그룹([\\w]) : 하나의 알파벳 -> One of 알파벳 or 숫자
		System.out.println("Hello          World".replaceAll(pattern, "$1-$3"));
		// "1 character + whitespaces + 1 character"
		/* 1번 예제
		replaceAll(pattern, replacement)는 pattern과 일치하는 문자열을 replacement로 변환
		예제에서 패턴과 일치하는 것은 "o w"이며, 첫번째 예제는 일치하는 문자열을 "-"로 변환하였다
		*/ 
	}
}
