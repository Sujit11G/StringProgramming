package String;

import java.util.Scanner;

public class FrequencyOfEveryCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		//s=s.toLowerCase();
		//char c[]=s.toCharArray();
		int upper=0;
		int lower=0;
		int special=0;
		int number=0;
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='A'&&c<='Z') {
				upper++;
			}
			else if(c>='a'&&c<='z') {
				lower++;
			}
			else if(c>='0'&&c<='9') {
				number++;
			}
			else
			{
				special++;
			}
		}
		
		  System.out.println("Lower case letters : " + lower);
	        System.out.println("Upper case letters : " + upper);
	        System.out.println("Number : " + number);
	        System.out.println("Special characters : " + special);
	}
}
