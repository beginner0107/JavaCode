package c2;

import java.util.Scanner;

public class C11 {
	public static void compress(String str) {
		char c = str.charAt(0);
		String answer = c + "";
		int n = 1;
		for(int i = 1;i<str.length();i++) {
			if(str.charAt(i) == c) {
				n ++;
			}else {
				if(n!=1) {
					answer += n;
				}
				n = 1;
				c = str.charAt(i);
				answer += c;
			}
		}
		if(n>1) answer += n;
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		compress(str);
		sc.close();
	}
}
