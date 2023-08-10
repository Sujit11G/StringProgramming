package String;

import java.util.Scanner;

public class Reverse_String {

	public  String reverseWord() {
		
		//String [] s=str.split(" ");
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String");
		String s=sc.nextLine();
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		
		
		
		return s1;
		
	}
	
	public static void main(String[] args) {
		
		Reverse_String r=new Reverse_String();
		
		System.out.println(r.reverseWord());
		
	}
}
