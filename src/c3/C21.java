package c3;

import java.util.Scanner;

/*
격자판 최대합
1. int n을 sc.nextInt()
2. 2차원 배열 생성 (0,1) (0,2) (0,3) ....(0,n) ... (n,n)
3. 값을 입력 받고
4. 최댓값을 설정. 가로 세로 대각선 경우의 수 패턴을 더해가면서 최댓값을 바꾼다.
 */
public class C21 {
	
	public int solution(int n, int [][]arr) {
		int answer = Integer.MIN_VALUE;
		int sum1,sum2;
		for(int i=0;i<n;i++) {
			sum1 = sum2 = 0;
			for(int j=0;j<n;j++) {
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1=sum2=0;
		for(int i=0;i<n;i++) {
			sum1+=arr[i][i];
			sum2+=arr[i][n-i-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C21 c = new C21();
		int n = sc.nextInt();
		int [][]arr = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(c.solution(n, arr));
		sc.close();
	}
}
