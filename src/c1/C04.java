package c1;

import java.util.Scanner;

public class C04 {
	public static void reverse(String[]arr) {
		for(String k : arr) {
			System.out.println(new StringBuilder(k).reverse());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[]arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.next();
		}
		reverse(arr);
		sc.close();
	}
}
