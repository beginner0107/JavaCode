package c3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C26 {
	public ArrayList<Integer>solution(int n, int m, int[]a, int[]b){
		ArrayList<Integer>answer = new ArrayList<Integer>();
		/*
		 * for(int i=0;i<a.length;i++) { for(int j=0;j<b.length;j++) { if(a[i]==b[j]) {
		 * list.add(a[i]); break; } } } Collections.sort(list);
		 */
		Arrays.sort(a);
		Arrays.sort(b);
		int p1=0, p2=0;
		while(n>p1&&m>p2) {
			if(a[p1]==b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1]<b[p2]) p1++;
			else p2++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		C26 c = new C26();
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int []arr1 = new int[n1];
		for(int i=0;i<n1;i++) {
			arr1[i] = sc.nextInt();
		}
		
		int n2 = sc.nextInt();
		int []arr2 = new int[n2];
		for(int i=0;i<n2;i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int i:c.solution(n1, n2, arr1, arr2)) {
			System.out.print(i+" ");
		}
		
		
		sc.close();
	}
}
