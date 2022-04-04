package c2;

import java.util.Scanner;

public class C19 {
	
	public static void score(int []num) {
		int count = 0;
		int sum = 0;
		for(int i=0;i<num.length-1;i++) {
			if(num[i]==0&&num[i+1]!=1) continue;
			if(num[i]==1&&num[i+1]==1) {
				count++;
				sum += count;
				if(i+1==num.length-1) {
					sum += ++count;
				}
			}else if(num[i]==1&&num[i+1]==0){
				sum += ++count;
				count = 0;
			}else if(num[i]==0&&num[i+1]==1&&i+1==num.length-1) {
				sum += 1;
			}
		}
		System.out.println(sum);
	}
	
	public int solution(int n, int[] arr) {
		int answer = 0, cnt = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] == 1) {
				cnt ++;
				answer += cnt;
			}else {
				cnt = 0;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		score(num);
		
		sc.close();
	}
}
