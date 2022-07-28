package Strings;

public class basics {

	public static void main(String[] args) {
		String str="hello";    // string pool mei bnega ek address pr
		String sa="hello";      // same address pr bnega str ke bcoz string pool mei duplicates not allowed
		
		//st and st11 dono alg alg adress mei bnege heap mei bcoz new keyword lga hai
		String st=new String("hello");  
		String st11=new String("hello");
		
		//function
		System.out.println(str.charAt(2));  //i index ka character print hojaega
		
		System.out.println(str.substring(1, 3)); //i index se j-1 tk sb char print 
		
		System.out.println(str.substring(2));  // i idx se baad ke saare char print
		
		System.out.println(st==st11);  //address compare dono ka (str sa true bcoz string pool mei hai
		
		System.out.println(str.equals(sa)); //content compare  (str sa st st11 sbke true)
		
		System.out.println(str.concat(sa));  //new address pr str+sa print
		
		System.out.println(str.compareTo(st11)); //ascii value ka difference dega str-st11 one by one char check krta
		
		System.out.println(str.toUpperCase()); //sb capital bna deta
		System.out.println(str.toLowerCase()); // sb capital
	}

}
