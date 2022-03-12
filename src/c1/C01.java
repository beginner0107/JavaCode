package c1;

import java.util.Scanner;

public class C01 {
	public static int count(String str, char c) {
		int count = 0;
		str = str.toLowerCase();
		c = Character.toLowerCase(c);
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		sc.close();
		System.out.println(count(str, c));
	}
}
