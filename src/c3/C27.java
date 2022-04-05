package c3;

import java.util.Scanner;

public class C27 {
	// Sliding window
	public int solution(int n, int m, int[]arr) {
		int answer = 0;
		int sum = 0;
		for(int i=0;i<m;i++) {
			sum+= arr[i];
		}
		answer = sum;
		
		for(int i=m;i<n;i++) {
			sum+=arr[i]-arr[i-m];
			
			if(sum>answer) answer=sum;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C27 c = new C27();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(c.solution(n, m, arr));
		sc.close();
	}
}
