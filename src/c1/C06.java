package c1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class C06 {
	
	public static void overlap(String str) {
		/*
		 * List<String>list = Stream.of(str.split("")).collect(Collectors.toList());
		 * for(int i=0;i<list.size();i++) { String tmp = list.get(i); for(int
		 * j=i+1;j<list.size();j++) { if(tmp.equals(list.get(j))) { list.remove(j); j--;
		 * if(i!=0) { i--; } } } }
		 * 
		 * System.out.println(String.join("", list));
		 */
		
		LinkedHashSet<String>set = new LinkedHashSet<>();
		for(String s : str.split("")) set.add(s);
		System.out.println(String.join("", set));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		overlap(str);
		
		sc.close();
	}
}
