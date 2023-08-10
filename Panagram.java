package String;

import java.util.Scanner;

public class Panagram {

	public static boolean isPanagram(String s) {
		
		if(s.length()<26) {
			return false;
		}
		System.out.println(s.length());
		for(char c='a';c<='z';c++) {
			if(s.indexOf(c)==-1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println(isPanagram(s));
	}
}
