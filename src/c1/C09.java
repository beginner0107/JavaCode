package c1;

import java.util.Scanner;

public class C09 {
	public static void extract(String str) {
		String pattern = "[^0-9]";
		str = str.replaceAll(pattern, "");
		int answer = Integer.parseInt(str);
		System.out.println(answer);
	}
	
	public int solution(String s) {
		int answer = 0;
		for(char x : s.toCharArray()) {
			if(x>=48 && x<=57) answer = answer * 10+(x-48);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		extract(str);
		sc.close();
	}
}
