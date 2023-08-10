package String;

import java.util.Scanner;

public class FirstLetterCaps {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String s1="";
		String[] word=s.split("\\s");                                 // "\\s" stands for white space. It removes white space 
	
		for(int i=0;i<word.length;i++) {
				
			char c=word[i].charAt(0);                                // print first letter of every word
			String c1=String.valueOf(c).toUpperCase();               //convert first letter to UpperCase
			String sub=word[i].substring(1);                         //It remains Substring 
			s1=s1+c1+sub+" ";	
		}
		System.out.println(s1.trim());     
		
	

	}
}
 