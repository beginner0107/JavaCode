package c2;

import java.util.Scanner;

public class C17 {
	
	public static void isPrime(int n) {
		int k = 0;
		for(int i=2;i<=n;i++) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) k++;
		}
		System.out.println(k);
	}
	
	public int solution(int n) {
		int answer = 0;
		int[] ch = new int[n+1];
		for(int i=2; i<=n;i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i;j<=n;j=j+i) {
					ch[j] = 1;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		isPrime(n);
		C17 c17 = new C17();
		System.out.println(c17.solution(n));
		
		sc.close();
	}
}
