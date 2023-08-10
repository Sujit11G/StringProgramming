package String;

import java.util.Scanner;

public class FrequencyString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		int a[]=new int[128];
		s=s.toLowerCase();
//		for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			a[c]++;
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==1) 
//			{
//				System.out.println((char)i+" is unique character");
//			}
//			else if(a[i]!=0)
//			{
//			    System.out.println((char)i+" is present "+a[i]+" times");
//			}
//		}
		
		for(char ch='a';ch<='z';ch++) {
			int c=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i))
					c++;
			}
			if(c!=0) 
			System.out.println(ch+" character present "+c+" times");
			
		//	System.out.println(ch+ " character is duplicated "+c+" times");
			
		}
	}
}
