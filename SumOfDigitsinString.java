package String;

import java.util.Scanner;

public class SumOfDigitsinString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		//s=s.toLowerCase();
		//char c[]=s.toCharArray();
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
		
		    if(Character.isDigit(c)) {                  
			sum=sum+Character.getNumericValue(c);	
			}
			
//			if(c>='0' && c<='9'){
//				sum=sum+(c - '0');
//			}
			
		}
	        System.out.println(sum);
	        
	}
}




