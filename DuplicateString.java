package String;

import java.util.Scanner;

public class DuplicateString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			 for( int j=i+1;j<s.length();j++) {
				 if(c[i]==c[j]) {
				 System.out.println(c[j]+" is Duplicate Character");
			 	
			  
				 }
				 
			 }
			 
			
		}	
	}
}
