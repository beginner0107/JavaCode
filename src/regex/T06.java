package regex;

import static org.junit.Assert.*;

import org.junit.Test;

public class T06 {
	@Test
	public void ex6() {
		String pattern = "\\d\\D";
		assertTrue("1a".matches(pattern));
		assertFalse("a1".matches(pattern));

		pattern = "\\d\\s\\D";
		assertTrue("1 a".matches(pattern));

		pattern = "\\d\\s\\S\\D";
		assertTrue("1 1a".matches(pattern));

		pattern = "\\w\\W";
		assertTrue("1 ".matches(pattern));
		/*
		Regular Expression       Description
		       .	                  어떤 문자 1개를 의미
		    ^regex	          ^ 다음 regex로 line을 시작하는지
		    regex$	          $ 앞의 regex가 line의 마지막으로 끝나는지
		    [abc]	          a, b, c 중의 문자 1개
		    [abc][vz]	      a, b, c 중에 문자 1개와 v, z 중에 문자 1개의 조합
		    [^abc]	          a, b, c를 제외한 문자 1개
		    [a-d1-7]	      ad, 17 사이의 문자 1개
		    X|Z    	          X 또는 Z
			\d	              0~9 사이의 숫자, [0-9]와 동일
    		\D   	                  숫자가 아닌 어떤 문자, [^0-9]와 동일
    		\s	              whitespace 1개, [\t\n\x0b\r\f]와 동일
			\S				  whitespace를 제외한 문자
			\w			      Alphanumeric(alphabet, 숫자) 문자, [a-zA-Z_0-9]와 동일
			\W				  Alphanumeric을 제외한 문자(whitespace 등)
			\S+				  whitespace를 제외한 여러 문자
			\b	 			   단어의 경계(공백)를 찾습니다
		*/
	}
}
