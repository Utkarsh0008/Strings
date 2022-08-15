package dailyproblems;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch=str.charAt(str.length()-1);
		System.out.print(ch);
		for (int i = str.length()-2; i >=0; i--) {
			System.out.print(str.charAt(i));
			
		}

	}

}
