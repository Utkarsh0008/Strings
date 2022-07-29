package Strings;

import java.util.Scanner;

public class string_compression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		compress(str);

	}

	private static void compress(String str) {
		int count=1;
		String ans="";
		char ch=str.charAt(0);
		
		if(str.length()==1) {
			System.out.print(ans+ch);
		}
		for(int i=1;i<str.length();i++) {
			
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
				
			}
			
			else if(count>1) {
				System.out.print(ans+str.charAt(i-1)+count);
				count=1;
			}
			else{
				System.out.print(ans+str.charAt(i-1));
			}
			if(i==str.length()-1) {
				System.out.print(ans+str.charAt(i));
			}
		
		}
		
	}

}
