package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class T14 {
	@Test
	public void ex14() {
		String result;
		Pattern p = Pattern.compile("dog");
		Matcher m = p.matcher("The dog says meow. All dogs say meow.");
		System.out.println(m.replaceAll("cat"));
		
		result = "The cat sat on the mat.".replaceAll("at[.]", "*");
		System.out.println(result);
		
		result = "The cat sat on the mat.".replaceAll("at[.]?", "*");
		System.out.println(result);
		
		result = "The cat sat on the mat.".replaceAll("[a-z]+", "*");
		System.out.println(result);
	}
}
