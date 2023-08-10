package String;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String");
		String s=sc.nextLine();
		String s1="";
		String s2="";
		
		//First Method
		
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		
		if(s.equalsIgnoreCase(s1)) 
		{
		System.out.println(s+" is Palindrome");
		}
		else
		{
			System.out.println(s+" is not Palindrome");
		}
		
		//Second Method
		
		for(int i=0;i<s.length();i++) {
			s2=s.charAt(i)+s2;
			
		}
		//System.out.println(s2);
	}
}
