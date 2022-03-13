package c1;

import java.util.Scanner;

public class C09 {
	public static void extract(String str) {
		String pattern = "[^0-9]";
		str = str.replaceAll(pattern, "");
		int answer = Integer.parseInt(str);
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		extract(str);
		sc.close();
	}
}
