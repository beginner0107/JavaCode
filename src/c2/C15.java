package c2;

import java.util.Scanner;

public class C15 {
	public static void game(int[]a, int[]b) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) System.out.println("D");
			else if(a[i]==2&&b[i]==1) System.out.println("A");
			else if(a[i]==3&&b[i]==2) System.out.println("A");
			else if(a[i]==1&&b[i]==3) System.out.println("A");
			else System.out.println("B");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		int []b = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			b[i] = sc.nextInt();
		}
		
		game(a, b);
		
		sc.close();
	}
}
