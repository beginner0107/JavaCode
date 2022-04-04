package c1;

import java.util.Scanner;

public class C03 {
	public static String dan(String str) {
		String[]arr = str.split(" ");
		int count = 0;
		String n = "";
		for(String k : arr) {
			if(count<k.length()) {
				count=k.length();
				n = k;
			}
		}
		
		return n;
	}
	
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		while((pos = str.indexOf(' '))!=-1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		
		if(str.length()>m) answer = str; // 마지막 단어
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(dan(str));
		sc.close();
	}
}
