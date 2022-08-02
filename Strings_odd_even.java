package Strings;

import java.util.Scanner;

public class Strings_odd_even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		oddeven(str);

	}

	private static void oddeven(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			String ans="";
			char ch=str.charAt(i);
			if(i%2==0) {
				ch=(char)(ch+1);
				System.out.print(ans+ch);
				
			}
			else {
				ch=(char)(ch-1);
				System.out.print(ans+ch);
			}
			
		}
		
		
	}

}
