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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		palindrome(str);
		sc.close();
	}
}
