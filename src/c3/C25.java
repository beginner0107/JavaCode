package c3;

import java.util.ArrayList;
import java.util.Scanner;

public class C25 {
	// Two Pointers Algorithm
	public ArrayList<Integer> solution(int n, int m,int[]a, int[]b){
		ArrayList<Integer> answer = new ArrayList<>();
		/*
		 * for(int i:a) { list.add(i); } for(int i:b) { list.add(i); }
		 * 
		 * Collections.sort(list);
		 */
		int p1=0, p2=0;
		while(p1<n && p2<m) {
			if(a[p1]<b[p2]) answer.add(a[p1++]);
			else answer.add(b[p2++]);
		}
		
		while(p1<n) answer.add(a[p1++]);
		while(p2<m) answer.add(b[p2++]);
		
		return answer;
	}
	
	public static void main(String[] args) {
		C25 c = new C25();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[]arr1 = new int[a];
		for(int i=0;i<a;i++) {
			arr1[i] = sc.nextInt();
		}
		
		
		int b = sc.nextInt();
		int[]arr2 = new int[b];
		for(int i=0;i<b;i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int i : c.solution(a,b,arr1,arr2)) {
			System.out.print(i+" ");
		}
		
		sc.close();
	}
}
