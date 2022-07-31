package Strings;

import java.util.Scanner;

public class can_you_read {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		printans(str);
		
           
		}

	

	private static void printans(String str) {
		String ans="";
		ans=ans+str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			
           char ch=str.charAt(i);
           
           if(ch<96) {
        	   System.out.println(ans);
        	   ans="";
        	   System.out.print(ans+ch);   
            	  
           }
         
           else {
        	   
        	   ans=ans+ch;
           }
		
	}System.out.println(ans);//corner case if last mei small hote to print hi nhi hota

}}
