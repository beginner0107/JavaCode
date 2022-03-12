package regex;

import static org.junit.Assert.*;

import org.junit.Test;

public class T07 {
	@Test
	public void ex7() {
		String pattern = "a*[0-9]*"; // *은 * 앞의 요소가 0회 이상 반복되는 것을 의미
									 // a가 반복되며 0~9의 숫자가 반복되어 나타나면 True
		assertTrue("aaa123".matches(pattern));
		assertTrue("aaa".matches(pattern));
		
		pattern = "a*[0-9]+"; // +는 1이상 반복되는 것을 의미 
							  // 요소가 없으면 패턴과 일치하지 않는다는 의미
		assertTrue("aaa123".matches(pattern));
		assertFalse("aaa".matches(pattern));
		
		// Quantifiers는 요소들을 얼마나 반복시킬지 정의합니다.
		/* Regular Experssion      Description
		          *                 0회 이상 반복
		          +                 1회 이상 반복
		          ?                 0 또는 1회만
		         {X}                X회 이상 반복
		        {X,Y}               X~Y사이의 수만큼 반복
		         *?                 가장 적게 일치하는 패턴을 찾음              
		*/
	}
}
