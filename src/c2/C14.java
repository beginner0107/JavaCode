package c2;

import java.util.Scanner;

public class C14 {
	public static int student(int[] b) {
		int count = 1;
		int n = b[0];
		for(int i=1;i<b.length;i++) {
			if(n<b[i]) {
				count++;
				n = b[i];
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int []b = new int[a];
		for(int i=0;i<b.length;i++) {
			b[i] = sc.nextInt();
		}
		System.out.println(student(b));
		sc.close();
	}
}
