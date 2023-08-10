package String;

public class CharAt {

	public static void main(String[] args) {
		String s="TODAY I M LEARNING STRING CLASS";
		char[]c=new char[s.length()];
		for(int i=0;i<c.length;i++) {
			char ch=s.charAt(i);
			c[i]=ch;
		}
		System.out.println(c);
		
		char c1[]=s.toCharArray();
	//	System.out.println(c1);
		
		byte b[]=s.getBytes();
		for(int i=0;i<b.length;i++) {
		//	System.out.print(b[i]+" ");
		}
		System.out.println(s.length());
		}
	
	
}
