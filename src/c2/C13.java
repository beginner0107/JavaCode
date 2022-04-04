package c2;

import java.util.ArrayList;
import java.util.Scanner;

public class C13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		bigNum(n, a);
		sc.close();
	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(arr[0]);
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1])
				answer.add(arr[i]);
		}
		return answer;
	}

	private static void bigNum(int n, int[] a) {
		System.out.printf("%d ", a[0]);
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1])
				System.out.print(a[i] + " ");
		}
	}
}
