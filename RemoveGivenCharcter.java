package String;

import java.util.Scanner;

public class RemoveGivenCharcter {

	public static void main(String[] args) {  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the character want to be remove from String");
		String ch=sc.nextLine();
         
        System.out.println(charRemoveAt(s, ch));  
     }  
     public static String charRemoveAt(String str, String ch) {  
        return str.replace(ch, "");  
     }  
}
