package String;

import java.util.Scanner;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	int str=s.indexOf(ch,i+1);
        	if(str==-1) {
        		sb.append(ch);
        	}
        }
        System.out.println(sb);
        
        
        

    }
}
