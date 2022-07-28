package Strings;

import java.util.Scanner;

public class palindromic_substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
	
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				String s1=(str.substring(i, j));
				if(ispalindrome(s1)==true) {
					System.out.println(s1);
					
				}
				
			}
		}
		
		

	}

	private static boolean ispalindrome(String str) {
		
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
				
			
			}
			else {
				return false;
			}
		}
		
		return true;
		
	}

}
