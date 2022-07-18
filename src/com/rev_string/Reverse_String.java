package com.rev_string;

//import java.util.Scanner;

public class Reverse_String {
	static String f = "sathish";
	
	public static void main(String[] args) {

//	  String original,reverse= " ";

//	  Scanner s = new Scanner(System.in);
//	  System.out.println("Enter a string to reverse");
//	  
//	  original = s.nextLine();
//	  int len = original.length();
//	  for (int i = len-1; i>=0; i--) {
//		reverse= reverse+original.charAt(i);
//		
//		
//	}
//	  System.out.println("Reverse of entered string=" + reverse);
//	  
		
		for (int i = f.length()- 1; i >= 0; i--) {
			 char charAt = f.charAt(i);
			 System.out.print(charAt);
			
		}
	}
	

}


