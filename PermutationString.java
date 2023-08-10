package String;

import java.util.Scanner;

public class PermutationString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
             stringPermutation(s,"");
             
             
	}
	
	public static void stringPermutation(String str,String ans) {
		//String s1="";
		if(str.length()==0) {
			System.out.println(ans+" ");
			return  ;
			
		}
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			String ros=str.substring(0,i)+str.substring(i+1);
			
			 stringPermutation(ros,ch+ans);
			
		}
		
		
	}
}
