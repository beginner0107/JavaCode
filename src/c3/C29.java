package c3;

import java.util.Scanner;

public class C29 {
	public int solution(int n) {
		int answer = 0, lt = 0;
		int sum = 0;
		for(int i=1;i<n;i++) {
			sum += i;
			if(sum == n) answer++;
			while(sum>=n) {
				sum -= ++lt;
				if(sum==n)answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		C29 c = new C29();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(c.solution(n));
		sc.close();
	}
}
