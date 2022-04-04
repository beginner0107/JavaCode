package c1;

import java.util.Scanner;

public class C08 {
	public static String palindrome(String str) {
		String pattern = "[^a-zA-Z]";
		str = str.replaceAll(pattern, "").toLowerCase();
		char[]c = str.toCharArray();
		int left = 0;
		int right = c.length-1;
		while(left<=right) {
			if(c[left]!=c[right]) {
				return "NO";
			}else {
				left++; right--;
			}
		}
		return "YES";
	}
	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^a-zA-Z]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp))answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(palindrome(str));
		sc.close();
	}
}
