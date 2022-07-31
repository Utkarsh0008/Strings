package Strings;

import java.util.Scanner;

public class difference_Ascii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		diiference(str);

	}

	private static void diiference(String str) {
		
		char prev=str.charAt(0); //first element 
		for (int i = 0; i < str.length(); i++) {
			String ans="";
			char curr=str.charAt(i);  //currrent wale ka track rkhega 
			System.out.print(ans=ans+prev+(curr-prev)); //internally typecast hojaega curr-prev
			prev=curr;  //prev ko current bnaege aage iterate krne k liye
		}
		System.out.println(prev);
		
	}

}
