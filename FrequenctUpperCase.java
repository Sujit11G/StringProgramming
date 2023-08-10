package String;

import java.util.Scanner;

public class FrequenctUpperCase {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the String");
//		String s=sc.nextLine();
//		//s=s.toLowerCase();
//		//char c[]=s.toCharArray();
//		int count=0;
//		
//		for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			if(c>='A'&&c<='Z')
//				count++;
//		}
//		System.out.println(" count ="+count);
		
		StringBuffer b=new StringBuffer("ABC");
		StringBuffer c=new StringBuffer("ABC");
		
		StringBuilder d=new StringBuilder("ABC");
		StringBuilder e=new StringBuilder("ABC");
		
		System.out.println(d.equals(e));
		
		System.out.println(d.hashCode());
		System.out.println(e.hashCode());


		
	}
}
