package org.test;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("input data");
		String org = s.nextLine();
		System.out.println(org);
		String rev="";
		for (int i = org.length()-1; i >=0; i--) {
			char ch = org.charAt(i);
			rev=rev+ch;
			
		}
		if (org.equals(rev)) {
			System.out.println("pallindrome");
		} else {
			System.out.println("not pollindrome");

		}
		
		
		
		
	}
	

}
