package c3;

import java.util.Scanner;

public class C24 {
	
	public int solution(int n, int m, int[][]arr) {
		int answer = 0;
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m;j++) {
				int cnt = 0;
				for(int k=0;k<n;k++) {
					int pi=0, pj=0;
					for(int s=0;s<m;s++) {
						if(arr[k][s]==i) pi = s;
						if(arr[k][s]==j) pj = s;
					}
					if(pi>pj) {
						cnt++;
					}
				}
				if(cnt==n) {
					answer++;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C24 c = new C24();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int[][]arr = new int[n2][n1];
		
		for(int i=0;i<n2;i++) {
			for(int j=0;j<n1;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(c.solution(n2, n1, arr));
		sc.close();
	}
}
