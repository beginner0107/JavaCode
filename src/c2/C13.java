package c2;

import java.util.Scanner;

public class C13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		bigNum(n, a);
		sc.close();
	}

	private static void bigNum(int n, int[] a) {
		System.out.printf("%d ",a[0]);
		for(int i=1;i<a.length;i++) {
			if(a[i-1]<a[i]) {
				if(i==a.length-1) {
					System.out.print(a[i]);
				}else {
					System.out.print(a[i] + " ");
				}
			}
		}
	}
}
