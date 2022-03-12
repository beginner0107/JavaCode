package c1;

import java.util.Scanner;

public class C02 {
	public static String change(String str) {
		String answer = "";
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				answer += (str.charAt(i)+"").toUpperCase();
			}else {
				answer += (str.charAt(i)+"").toLowerCase();
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		System.out.println(change(str));
		
	}
}
