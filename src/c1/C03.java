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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(dan(str));
		sc.close();
	}
}
