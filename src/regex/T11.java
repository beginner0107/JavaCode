package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class T11 {
	@Test
	public void ex11() {
		// Regex는 "\d"와 같이 String으로 표현 가능 
		// Pattern은 컴파일 된 Regex
		Pattern pattern = Pattern.compile("\\bcat\\b");
		// \\b -> 앞 or 뒤로 공백이 있고 cat이라는 문자가 있는 모양이 패턴
		// Regex String을 컴파일하여 Pattern이라는 객체로 만든다.
		
		// Matcher는 match operation을 수행하는 engine
		Matcher matcher = pattern.matcher("cat cat cat cattie cat");
		
		int count = 0;
		while(matcher.find()) {
			count++;
			System.out.println("Match number " + count);
			// group()은 일치하는 문자열을 리턴
			System.out.println("group(): " + matcher.group());
			// start()는 첫번째 문자의 index를 리턴
			System.out.println("start(): " + matcher.start());
			// end()는 마지막 문자의 index를 리턴
			System.out.println("end(): " + matcher.end());
			System.out.println("------------------------------");
		}
		
	}
}
