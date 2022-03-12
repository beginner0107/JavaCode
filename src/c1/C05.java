package c1;

import java.util.Scanner;

public class C05 {
	public static String reverse(String str) {
		int left = 0;
		int right = str.length()-1;
		String[]arr = str.split("");
		while(left<=right) {
			if(Character.isAlphabetic(arr[left].charAt(0))) {
				if(Character.isAlphabetic(arr[right].charAt(0))) {
					String tmp = arr[left];
					arr[left] = arr[right];
					arr[right] = tmp;
					left++;
					right--;
				}else right--;
			}else left++;
		}
		return String.join("", arr);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reverse(str));
		sc.close();
	}
}
