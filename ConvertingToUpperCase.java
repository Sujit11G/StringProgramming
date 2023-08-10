package String;

import java.util.Scanner;

public class ConvertingToUpperCase {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		s=s.toUpperCase();
		s=s.toLowerCase();
//		char c[]=s.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			c[i]=(char)(c[i]-32);
//		}
		System.out.println(s);
	}
}
