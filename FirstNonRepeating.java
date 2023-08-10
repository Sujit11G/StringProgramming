package String;

import java.util.Scanner;

public class FirstNonRepeating {

	public static void firstNonRepeating(String s) {
		
		for(int i=0;i<s.length();i++) {
			if(s.indexOf(s.charAt(i),s.indexOf(s.charAt(i))+1)==-1) {
				System.out.println("First Non Repeating Character is: "+s.charAt(i));
				break;
			}	
		}	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		firstNonRepeating(s);
	}
}
