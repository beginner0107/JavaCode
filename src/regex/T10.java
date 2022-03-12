package regex;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class T10 {
	@Test
	public void ex10() {
		String pattern = "a*[0-9]*";
		assertTrue("aaa123".matches(pattern));

		pattern = "\\s";
		String arr[] = "Hello World Java Regex".split(pattern);
		System.out.println(Arrays.asList(arr));

		pattern = "Hello";
		System.out.println("Hello World Hello World ".replaceFirst(pattern, "Regex"));

		pattern = "Hello";
		System.out.println("Hello World Hello World ".replaceAll(pattern, "Regex"));
		/*
		        Method											Description
		String.matches(regex)					String이 regex와 일치하면 true 리턴
		String.split(regex)						regex와 일치하는 것을 기준으로 String을 분리하여 배열로 리턴
		String.replaceFirst(regex, replacement)	regex와 가장 먼저 일치하는 것을 replacement로 변환
		String.replaceAll(regex, replacement)	regex와 일치하는 모든 것을 replacement로 변환
		 */
	}
}
