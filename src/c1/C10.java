package c1;

import java.util.Scanner;

public class C10 {
	public static void scharacter(String str, char c) {
		int[] a = new int[str.length()];
		int n = 0;
		char[]ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==c) {
				n = 0;
			}else {
				if(i<str.indexOf(c)) {
					a[i] = 10001;
					continue;
				}
				n ++;
				a[i] = n;
			}
		}
		
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]==c) {
				n = 0;
			}else {
				n ++;
				a[i] = Math.min(n, a[i]);
			}
		}
		
		for(int m : a) {
			System.out.print(m + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		scharacter(str, c);
		sc.close();
	}
}
