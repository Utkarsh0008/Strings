package leetcode_ke_qps;

import java.util.Scanner;

public class longest_palindrom_substr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
	//		System.out.println(ispalindrome(str));
         
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				String s1=(str.substring(i, j));
				if(ispalindrome(s1)==true) {
					System.out.println(s1);
					count++;
					
				}
				
			}
		}
		System.out.println(count);
		
		

	}

	private static boolean ispalindrome(String str) {
		
		int i=0;
		int j=str.length()-1;
		 
         int ans=0;
		while(i<=j) {
			int count =0;
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
				count++;
				
			
			}
			else {
				count=0;
				return false ;
				
			}
		}
		
		return true;
		
	}

}
