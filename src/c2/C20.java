package c2;

import java.util.Scanner;

public class C20 {
	
	public int[] solution(int n, int[]arr) {
		int[] answer = new int[n];
		for(int i = 0; i<n; i++) {
			int cnt = 1;
			for(int j = 0; j<n; j++) {
				if(arr[i]<arr[j]) {
					cnt++;
				}
			}
			answer[i] = cnt;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C20 c = new C20();
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		
		for(int x:c.solution(n, arr)) System.out.print(x + " ");
		
		sc.close();
	}

}
