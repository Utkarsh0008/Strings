package Strings;

import java.util.Scanner;

public class Toggle_case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			String str1="";
			if(str.length()>1000||str.length()<1) {
				break;
			}
			if((int)(ch)>96) {
		System.out.print(str1+str.toUpperCase().charAt(i));
			}
			else {
				System.out.print(str1+str.toLowerCase().charAt(i));
			}
		}

	}

}
