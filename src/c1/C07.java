package c1;

import java.util.Scanner;

public class C07 {
	public static void palindrome(String str) {
		str = str.toLowerCase();
		int left = 0;
		int right = str.length()-1;
		String answer = "YES";
		while(left<=right) {
			if(str.charAt(left)!=str.charAt(right)){answer="NO"; break;}
			else left++; right--;
		}
		System.out.println(answer);
	}
	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
		}
		return answer;
	}
	
	public String solution1(String str) {
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		palindrome(str);
		sc.close();
	}
}
