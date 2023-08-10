package String;

public class Frequency {

	
	public static void main(String []args) {
		
		String s="Hello Boss";
		String s2="";
		int count=0;
		char c[]=new char[s.length()];
//		for(int i=0; i<c.length;i++ ) {
//			char c1=s.charAt(i);
//			c1=Character.toLowerCase(c1);
//			if(Character.isWhitespace(c1)||Character.isDigit(c1))
//			count++;
//		}
		System.out.println(count);
		
		char c2[]=s.toCharArray();
		System.out.println(c2);
		
		for(int i=0; i<c.length;i++ ) {
			char c1=s.charAt(i);
			
			if(Character.isLowerCase(c1))
				s2=s2+Character.toUpperCase(c1);
			else
				s2=s2+Character.toLowerCase(c1);	
		}
		System.out.println(s2);
		
	}
	
	
	
}
