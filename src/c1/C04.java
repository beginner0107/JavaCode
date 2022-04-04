package c1;

import java.util.ArrayList;
import java.util.Scanner;

public class C04 {
	public static void reverse(String[]arr) {
		for(String k : arr) {
			System.out.println(new StringBuilder(k).reverse());
		}
	}
	
	public ArrayList<String> solution(int n, String[]str){
		ArrayList<String>answer = new ArrayList<String>();
		for(String x : str) {
			char[]s = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[]arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.next();
		}
		reverse(arr);
		sc.close();
	}
}
