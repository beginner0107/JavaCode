package c2;

import java.util.ArrayList;
import java.util.Scanner;

public class C18 {
	public static void prime(int num[]) {
		for(int i=0;i<num.length;i++) {
			if(isPrime(num[i])) {
				System.out.print(Integer.parseInt(new StringBuilder(String.valueOf(num[i])).reverse()+"")+" ");
			}
		}
	}
	
	public static boolean isPrime(int n) {
		boolean p = true;
		String str = new StringBuilder(String.valueOf(n)).reverse()+"";
		n = Integer.parseInt(str);
		if(n==1) p=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) { 
				p=false;
				break;
			}
		}
		
		return p;
	}
	
	public ArrayList<Integer> solution(int n, int[]arr){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp>0) {
				int t = tmp%10;
				res = res * 10 + t;
				tmp = tmp/10;
			} // 거꾸로 하는 로직
			if(isPrime2(res)) answer.add(res);
		}
		
		return answer;
	}
	
	public boolean isPrime2(int num) {
		if(num==1) return false;
		for(int i=2;i<num;i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		prime(num);
		sc.close();
	}
}
