package c2;

import java.util.Scanner;
/*
 피보나치 수열
 앞의 두 항을 더해서 다음 숫자가 되는 수열
 7
 1 1 2 3 5 8 13
 */
public class C16 {
	public static int[] fibonacci(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i=2;i<n;i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		return answer;
	}
	
	public void solution(int n) {
		int a = 1, b = 1, c;
		System.out.println(a + " " + b + " ");
		for(int i=2;i<n;i++) {
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int x : fibonacci(n)) System.out.print(x+" ");
		
		sc.close();
	}
}
